//��O�����������֐���try-catch���������ꍇ�A�Ăяo���K�w���߂�A���߂Č�����catch�������s�����
class Exception3 {
    public static void main(String[] args) {
        System.out.println("Main Start");
        a();
        System.out.println("Main End");
    }    
    static void a() {
        System.out.println("a Start");
        try {
            b();
        }
        catch(ArithmeticException e) {      //������b()�̗�O���L���b�`�ł���
            System.out.println("Error: "+e);
        }
        finally {
            System.out.println("a-finally");
        }
        System.out.println("a End");
    }
    static void b() {
        System.out.println("b Start");
        try {
            int a,b=0;
            a=10/b;     //0���Z
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+e);
        }
        finally {
            System.out.println("b-finally");
        }
        System.out.println("b End");
    }
}
