//format���\�b�h�i�N���X���\�b�h�Aprintf�Ɠ����j
class StringFormat {
    public static void main(String [] args) {
        int i=15, j=20;
        double d=3.14;
        String fmt1=String.format("%3d,%3d,%6.2f",i,j,d);
        String fmt2=String.format("%3x,%3x",i,j);   //16�i��3��
        System.out.println(fmt1);
        System.out.println(fmt2);
    }    
}
