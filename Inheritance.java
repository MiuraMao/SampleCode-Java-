//�������ăX�[�p�[�N���X�̃R���X�g���N�^���Ăяo�����A���X�[�p�[�N���X�Ɉ�������̃R���X�g���N�^�݂̂̏ꍇ�́A
//�R���p�C���G���[�ƂȂ�
//���̂��߁A�X�[�p�[�N���X�ɖ������̃R���X�g���N�^��ǉ����Ȃ���΂Ȃ�Ȃ��i�����ł�ClassP(){}�j
class ClassP {
    int ival;
    ClassP(int i) {ival=i;}     //��������̃R���X�g���N�^�̂��߁A�f�t�H���g�R���X�g���N�^�͍쐬����Ȃ�
    public void set(int i) {ival=i;}
    public void print() {
        System.out.printf("---\nival=%d\n",ival);
    }
}
class ClassC extends ClassP {
    String sval;
    ClassC(int i, String s) {
        super(i);
        sval=new String(s);
    }
    public void set(int i, String s) {ival=i; sval=s;}
    public void print() {
        super.print();
        System.out.printf("sval=%s\n",sval);
    }
}
class Inheritance {
    public static void main(String[] args) {
        ClassP ca=new ClassP(10);
        ClassC cb=new ClassC(20,"abc");
        ca.print();
        cb.print();
        cb.set(5); cb.print();
    }
}
