//�����N���X�̐錾��static��t�����ꍇ�A�O���C���X�^���X���쐬�����ɗ��p�\
class A {
    static class B {
        static int v=0;
        int i;
        void print() {System.out.println("i="+i+" v="+v);}
    }
}
class StaticInnerClass {
    public static void main(String[] args) {
        A.B ins1=new A.B();     //�O���N���X��.�����N���X��.�����o�[��
        ins1.v=2;
        ins1.i=10;
        ins1.print();
        A.B ins2=new A.B();
        ins2.i=20;
        ins2.print();
    }
}
