//sub�X���b�h��Thread�ȊO�̃N���X���p������K�v������ꍇ��Runnable�C���^�[�t�F�[�X����������
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
        Thread th= new Thread(sth);     //run()���\�b�h�̊J�n
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
