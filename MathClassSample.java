//���w�֐�
class MathClassSample {
    public static void main(String[] args) {
        double a;
        long i;
        a=Math.abs(-10.5);
        System.out.println("-10.5�̐�Βl�́F"+a);
        a=Math.cos(Math.toRadians(30.0));
        System.out.println("30�x��cos�́F"+a);
        a=Math.toDegrees(Math.asin(0.5));
        System.out.println("arcsin(0.5)�́F"+a+"�x");
        i=Math.round(4.678);
        System.out.println("4.678���l�̌ܓ�����ƁF"+i);
        a=Math.log10(2.0);
        System.out.println("2�̏�p�ΐ��́F"+a);
        a=Math.log(2.0);
        System.out.println("2�̎��R�ΐ��́F"+a);
        a=Math.pow(4.0,5.0);
        System.out.println("4��5�悵���l�́F"+a);
    }    
}
