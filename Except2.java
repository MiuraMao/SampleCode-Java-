//try-catch��
class Except2 {
    public static void main(String[] args) {
        try {
            int[] ary=new int[5];
            ary[8]=5;
            System.out.println("ary[8]��5��������");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("�z��͈̔͂𒴂���");
        }
    }    
}
