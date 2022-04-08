import javax.swing.text.html.InlineView;
//エラーの例
class Involution {
    int val=20;     //インスタンス変数がstaticでないためクラスメソッド内で参照や代入不可（インスタンスメソッドも同様）
    public static int square(int i) {
        System.out.printf("val=%d\n",val);      //Error!
        return i*i;
    }
    public static int cube(int i) {
        return i*i*i;
    }
}
class ClassMethodError {
    public static void main(String[] args) {
        int i=5,j;
        Involution.val=10;                      //Error!（クラス名.インスタンス変数は参照不可）
        Involution inv=new Involution();
        j=Involution.square(i);
        System.out.printf("%d × %d=%d\n",i,i,j);
        j=Involution.cube(i);
        System.out.printf("%d × %d × %d=%d\n",i,i,i,j);
        j=inv.cube(i);                          //インスタンスinvを指定してクラス関数を呼び出す
        System.out.printf("%d × %d × %d=%d\n",i,i,i,j);
    }
}
