/*�V�O�l�`������v���郁�\�b�h���������A��������v����ϒ������̃��\�b�h���Ăяo����� */
class SomeClass {
    public void func(int... ary) {      //�ϒ������̃��\�b�h
        System.out.println("�����̐��F"+ary.length);
        for(int i=0; i<ary.length; i++) {
            System.out.println("ary["+i+"]="+ary[i]);
        }
    }
    public void func(int i) {
        System.out.println("�P������ func i="+i);
    }
    public void func(int i, int j, int k) {
        System.out.println("�R������ func i="+i+" j="+j+" k="+k);
    }
}

class OverloadVariable {
    public static void main(String... args) {
        SomeClass c=new SomeClass();
        c.func(11);
        c.func(21,22);      //�����̐����Q�̃��\�b�h�͒�`����Ă��Ȃ����߁A�ϒ������̃��\�b�h���Ăяo����
        c.func(31,32,33);
    }
}
