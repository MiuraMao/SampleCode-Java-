//���b�p�[�N���X
class IntegerClassSample {
    public static void main(String[] args) {
        System.out.println("int�̍ő�l�́F"+Integer.MAX_VALUE);
        System.out.println("int�̍ŏ��l�́F"+Integer.MIN_VALUE);
        Integer k=Integer.valueOf(123);     //new Integer(123)�͐�������Ȃ�
        Integer m=Integer.valueOf("321");   //new Integer("321")�͐�������Ȃ�
        System.out.printf("k=%d, m=%d\n",k,m);
        int iMin=Integer.min(15,25);
        int iMax=Integer.max(15,25);
        System.out.printf("iMin=%d, iMax=%d\n",iMin,iMax);
        Integer n=Integer.valueOf("101");
        System.out.println("n="+n);
    }    
}
