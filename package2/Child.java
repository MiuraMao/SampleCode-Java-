package package2;
import package1.Parent;
class Child extends Parent {
    private String strA;
    public Child(int ival,double dval,String s) {
        super(ival,dval);
        strA=s;
    }
    public void print() {
        super.print();
        System.out.println("strA="+strA);
    }
    public static void main(String[] args) {
        Child c=new Child(10,0.123,"name");
        c.print();
    }
}
/*�����̃p�b�P�[�W�ɂ܂�����R���p�C��*/
//javac -cp .;\home package2/Child.java     //.�i�J�����g�f�B���N�g���j��/home�ipackage1���u����Ă���t�H���_�j�w��

/*�p�b�P�[�W���̖����K��*/
//�p�b�P�[�W���̏Փ˂������悤�A�C���^�[�l�b�g�̃h���C������ɁA�t���ɕ��ׂč쐬����
//��Fu-abc.ac.jp�@���@jp.ac.u_abc�ijp/ac/u_abc/package1�@�̃t�H���_�Ƀp�b�P�[�W�������j