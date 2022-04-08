//クラスメソッドのユーザー定義
class Involution {
    public static int square(int i) {   //クラスフィールドと同様にstaticをつける
        return i*i;
    }
    public static int cube(int i) {     //クラスフィールドと同様にstaticをつける
        return i*i*i;
    }
}

class ClassMethod {
    public static void main(String[] args) {    //mainもクラスメソッド
        int i=5, j;
        j=Involution.square(i);
        System.out.printf("%d × %d=%d\n",i,i,j);
        j=Involution.cube(i);
        System.out.printf("%d × %d × %d=%d\n",i,i,i,j);
    }
}
