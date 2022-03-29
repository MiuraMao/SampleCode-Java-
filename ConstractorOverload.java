/*引数の型が異なるコンストラクタの多重定義（Overload）*/
/*デフォルトコンストラクタは引数を持つコンストラクタが無い時に作成される*/
class ClassB {
    int vali;
    double vald;
    String vals;
    ClassB(int i) {
        vali=i;         //何も設定しない場合デフォルト値は0
    }
    ClassB(double d) {
        vald=d;         //何も設定しない場合デフォルト値は0
    }
    ClassB(String s) {
        vals=s;         //何も設定しない場合デフォルト値はnull
    }
    public void printVals() {
        System.out.printf("vali=%d, vald=%f, vals=%s\n",vali,vald,vals);
    }
}
class ConstractorOverload {
    public static void main(String[] args) {
        ClassB c0,c1,c2;
        c0=new ClassB(10);
        c1=new ClassB(1.414);
        c2=new ClassB("文字列の代入");
        c0.printVals();
        c1.printVals();
        c2.printVals();
    }
}