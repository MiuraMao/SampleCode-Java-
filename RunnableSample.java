//subスレッドがThread以外のクラスも継承する必要がある場合はRunnableインターフェースを実装する
class SubThread implements Runnable {
    public void run() {
        try {
            for(int i=0; i<5; i++) {
                Thread.sleep(1000);
                System.out.println("SubThread:"+i);
            }
        }catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
class RunnableSample {
    public static void main(String[] args) {
        SubThread sth=new SubThread();
        Thread th= new Thread(sth);     //run()メソッドの開始
        th.start();
        try {
            for(int i=0; i<5; i++) {
                Thread.sleep(1000);
                System.out.println("MainThread:"+i);
            }
        }catch(InterruptedException e) {
            System.out.println(e);
        }

    }
    
}
