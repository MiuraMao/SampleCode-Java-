//try-catch��
class Except2 {
    public static void main(String[] args) {
        try {
            int[] ary=new int[5];
            ary[8]=5;
            System.out.println("ary[8]��5��������");
        }
        //catch(ArrayIndexOutOfBoundsException e) {     //Exception�̎q���̃N���X
        catch(Exception e) {                            //�ue�v�ɗ�O�̃I�u�W�F�N�g������
        //    System.out.println("�z��͈̔͂𒴂���");
            System.out.println(e);
        }
    }    
}
