//Thread�N���X�ɂ��}���`�X���b�h
//main�X���b�h��sub�X���b�h�����݂Ɏ��s�����ۏ؂͂Ȃ�
class SubThread extends Thread {
    public SubThread() {
        start();    //�T�u�X���b�h�̊J�n
    }
    public void run() {     //�T�u�X���b�h�Ŏ��s������e�irun()���\�b�h�̃I�[�o�[���C�h�j
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