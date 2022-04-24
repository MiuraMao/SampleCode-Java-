package package2;
import package1.Parent;
class Child extends Parent {
    private String strA;
    public Child(int ival,double dval,String s) {
        super(ival,dval);
        strA=s;
    }
    public void print() {
        super.print();
        System.out.println("strA="+strA);
    }
    public static void main(String[] args) {
        Child c=new Child(10,0.123,"name");
        c.print();
    }
}
/*複数のパッケージにまたがるコンパイル*/
//javac -cp .;\home package2/Child.java     //.（カレントディレクトリ）と/home（package1が置かれているフォルダ）指定

/*パッケージ名の命名規則*/
//パッケージ名の衝突が無いよう、インターネットのドメインを基に、逆順に並べて作成する
//例：u-abc.ac.jp　→　jp.ac.u_abc（jp/ac/u_abc/package1　のフォルダにパッケージが作られる）