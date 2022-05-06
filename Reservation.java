//�X���b�h�Ԃ̓���
class Seats {
    boolean[] seat;
    String[] name;
    Seats() {
        seat=new boolean[6];
        name=new String[6];
        for(int i=0; i<6; i++) 
            seat[i]=false;
    }
    public synchronized void reserve() {    //synchronized��t���邱�Ƃő��̃X���b�h�Ǝ��s���������Ȃ��悤�ɂ���
        int i;
        String userName;
        for(i=0; i<6 && seat[i]; i++);      //��Ȃ̊m�F
        if(i<6) {                           //��Ȃ̗\��
            userName=Thread.currentThread().getName();
            System.out.println(userName+" reserves seat["+i+"]");
            seat[i]=true;
            name[i]=userName;
        }
    }
    public void result() {
        System.out.println("--------------------------");
        for(int i=0; i<6; i++) {            //�\�񂳂�Ă��Ȃ��V�[�g�𓾂�
            if(seat[i])
                System.out.println("  ["+i+"] is reserved by "+name[i]);
            else
                System.out.println("  ["+i+"] is vacant");
        }
    }
}
class User extends Thread {
    Seats st;
    public User(String name, Seats s) {
        super(name);
        st=s;
    }
    public void run() {
        for(int i=0; i<3; i++)      //3�ȕ���\�񂷂�
            st.reserve();
    }
}
class Reservation {
    public static void main(String[] args) {
        Seats seat=new Seats();
        User usr1=new User("A",seat);
        User usr2=new User("B",seat);
        usr1.start();
        usr2.start();
        try {
            usr1.join();
            usr2.join();
        }catch(InterruptedException e) {};
        seat.result();
    }
}
