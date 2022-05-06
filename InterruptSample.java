class SubThread extends Thread {
    int times;
    public SubThread(String name) {
        super(name);
    }
    public void run() {
        for(times=0; times<5; times++) {
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                System.out.println(getName()+" is interrupted");    //getNameで割り込みを受けたスレッドの名前を取得する
            }
            System.out.println(getName()+" "+times);
        }
    }
}
class InterruptSample {
    public static void main(String[] args) {
        Thread mainThread=Thread.currentThread();   //メインスレッドの取得（mainという名前が自動的に割り当てられる）
        SubThread th1=new SubThread("SubThread A");
        SubThread th2=new SubThread("SubThread B");
        th1.start(); th2.start();       //メインクラスでスレッドを開始させている
        try {
            for(int i=0; i<5; i++) {
                Thread.sleep(500);
                System.out.println(mainThread.getName()+" "+i);
            }
        }catch(InterruptedException e) {
            System.out.println(e);
        }
        while(th2.times < 5) {
            if(th2.isInterrupted()==false) {
                th2.interrupt();        //sleep状態のスレッドに割込みをかける
                System.out.println("Send th2 interrupt");
            }
        }
    } 
}
