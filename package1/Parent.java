package package1;       //�p�b�P�[�W�̍쐬
public class Parent {
    private int ival;
    private double dval;
    protected Parent(int i, double d) {
        ival=i; dval=d;
    }
    protected void print() {
        System.out.println("ival="+ival+" dval="+dval);
    }
    protected void printNumerical() {
        System.out.println("ival="+ival+" dval="+dval);
    }
}

