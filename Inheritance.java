//明示してスーパークラスのコンストラクタを呼び出さず、かつスーパークラスに引数ありのコンストラクタのみの場合は、
//コンパイルエラーとなる
//そのため、スーパークラスに無引数のコンストラクタを追加しなければならない（ここではClassP(){}）
class ClassP {
    int ival;
    ClassP(int i) {ival=i;}     //引数ありのコンストラクタのため、デフォルトコンストラクタは作成されない
    public void set(int i) {ival=i;}
    public void print() {
        System.out.printf("---\nival=%d\n",ival);
    }
}
class ClassC extends ClassP {
    String sval;
    ClassC(int i, String s) {
        super(i);
        sval=new String(s);
    }
    public void set(int i, String s) {ival=i; sval=s;}
    public void print() {
        super.print();
        System.out.printf("sval=%s\n",sval);
    }
}
class Inheritance {
    public static void main(String[] args) {
        ClassP ca=new ClassP(10);
        ClassC cb=new ClassC(20,"abc");
        ca.print();
        cb.print();
        cb.set(5); cb.print();
    }
}
