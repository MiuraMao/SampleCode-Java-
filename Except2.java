//try-catch文
class Except2 {
    public static void main(String[] args) {
        try {
            int[] ary=new int[5];
            ary[8]=5;
            System.out.println("ary[8]に5を代入した");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えた");
        }
    }    
}
