//Object�N���X�̗�
class A {
    protected int i;
    protected String s;
    public String toString() {
    return "("+i+") :"+s;        
    }
    public boolean equals(A obj) {              //equals���\�b�h���I�[�o�[���C�h
        if(this.i==obj.i && this.s.equals(obj.s)) return true;
        else return false;
    }
}
class Object1 {
    public static void main(String [] args) {
        A ins=new A(); ins.i=10; ins.s="abcdefg";
        A cpy=ins;
        System.out.println(ins.getClass());     //�֘A�Â����Ă���I�u�W�F�N�g�������N���X��Ԃ�
        System.out.println(ins.toString());     //�I�u�W�F�N�g�̓��e�𕶎���ϊ�
        System.out.println(ins);                //toString���ȗ����Ă��ÖٓI�ɌĂяo�����
        A oth=new A(); oth.i=10; oth.s="abcdefg";
        if(ins == cpy)      //����I�u�W�F�N�g�̂��ߐ^�i�l�̔�r�ł͂Ȃ��j
            System.out.println("ins �� cpy �͓�����");
        else
            System.out.println("ins �� cpy �͈قȂ�");
        if(ins == oth)      //�l�͓��������قȂ�I�u�W�F�N�g�̂��ߋU
            System.out.println("ins �� oth �͓�����");
        else
            System.out.println("ins �� oth �͈قȂ�");
        if(ins.equals(oth)) //���e�̐^�U����
            System.out.println("ins �� oth �͓��e������");
        else
            System.out.println("ins �� oth �͓��e���قȂ�");
    }
    
}
