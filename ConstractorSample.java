/*�V�O�l�`�����قȂ镡���̃R���X�g���N�^*/
/*�R���X�g���N�^��return���Œl��Ԃ��Ȃ��B�܂��A�߂�l��void�Ƃ��Ă͂Ȃ�Ȃ�*/
class ClassA {
    int vala;
    int valb;
    ClassA() {
        vala=0; valb=0;
        System.out.println("�����Ȃ��̃R���X�g���N�^");
    }
    ClassA(int i) {
        vala=i; valb=0;
        System.out.println("�����P�̃R���X�g���N�^");
    }
    ClassA(int i, int j) {
        vala=i; valb=j;
        System.out.println("�����Q�̃R���X�g���N�^");
    }
    public void printVals() {
        System.out.printf("vala=%d, valb=%d\n",vala,valb);
    }
}
class ConstractorSample {
    public static void main(String[] args) {
        ClassA c0, c1,c2;
        c0=new ClassA();        //�C���X�^���X����
        c1=new ClassA(10);
        c2=new ClassA(5,20);
        c0.printVals();         //�t�B�[���h�l�̊m�F
        c1.printVals();
        c2.printVals();
    }
}