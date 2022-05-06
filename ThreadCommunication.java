class IntData {
    private int val=0;
    private boolean valset=false;
    public synchronized void setVal(int data) {
        while(valset == true) {
            try {wait();}
            catch(InterruptedException e) {}
        }
        val=data;
        valset=true;
        notify();
    }
    public synchronized int getVal() {
        while(valset==false) {
            try {wait();}
            catch(InterruptedException e) {}
        }
        valset=false;
        notify();
        return val;
    }
}
class GenerationData extends Thread {
    IntData dt;
    public GenerationData(IntData d) {
        dt=d;
    }
    public void run() {
        for(int i=0; i<3; i++) {
            double r=Math.random();
            int data=(int)(r*100000+1);     //1ˆÈã‚Ì—”‚ð”­¶‚·‚é
            dt.setVal(data);
        }
    }
}
class JudgePrime extends Thread {
    IntData dt;
    public JudgePrime(IntData d) {
        dt=d;
    }
    public void run() {
        int data=0;
        for(int i=0; i<3; i++) {
            data=dt.getVal();
            boolean succ=false;
        
            for(int j=2; j<data; j++)
                if((data % j)==0)
                    succ=true;
            if(succ==false)
                System.out.println(data+" is prime");
            else
                System.out.println(data+" is composite");
        }
    }
}
class ThreadCommunication {
    public static void main(String[] args) {
        IntData data=new IntData();
        GenerationData gd=new GenerationData(data);
        JudgePrime gp=new JudgePrime(data);
        gd.start();
        gp.start();
    }
    
}
