//スーパークラスより限定的なアクセス修飾をつけてはならない
class ClassP {
    int ival;
    ClassP(int i) {ival=i;}
    public void set(int i) {ival=i;}
    public void print() {
        System.out.printf("ival=%d\n",ival);
    }
}
class ClassC extends ClassP {
    String sval;
    ClassC(int i,String s)  {
        super(i);
        sval=s;
    }
    void set(int i, String s) {ival=i; sval=s;}     //ClassCで定義されたメソッドのためエラーとならない
    void print() {      //スーパークラスでpublicなのに対し、無指定のためコンパイルエラー
        super.print();
        System.out.printf("sval=%s\n",sval);
    }
}