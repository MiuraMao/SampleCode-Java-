//�X�[�p�[�N���X������I�ȃA�N�Z�X�C�������Ă͂Ȃ�Ȃ�
class ClassP {
    int ival;
    ClassP(int i) {ival=i;}
    public void set(int i) {ival=i;}
    public void print() {
        System.out.printf("ival=%d\n",ival);
    }
}
class ClassC extends ClassP {
    String sval;
    ClassC(int i,String s)  {
        super(i);
        sval=s;
    }
    void set(int i, String s) {ival=i; sval=s;}     //ClassC�Œ�`���ꂽ���\�b�h�̂��߃G���[�ƂȂ�Ȃ�
    void print() {      //�X�[�p�[�N���X��public�Ȃ̂ɑ΂��A���w��̂��߃R���p�C���G���[
        super.print();
        System.out.printf("sval=%s\n",sval);
    }
}