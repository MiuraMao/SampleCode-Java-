//Threadクラスによるマルチスレッド
//mainスレッドとsubスレッドが交互に実行される保証はない
class SubThread extends Thread {
    public SubThread() {
        start();    //サブスレッドの開始
    }
    public void run() {     //サブスレッドで実行する内容（run()メソッドのオーバーライド）
        try {
            for(int i=0; i<5; i++) {
                Thread.sleep(1000);
                System.out.println("SubThread:"+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
class ThreadSample{
    public static void main(String[] args) {
        SubThread th=new SubThread();
        try {
            for(int i=0; i<5; i++) {
                Thread.sleep(1000);
                System.out.println("MainThread:"+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}