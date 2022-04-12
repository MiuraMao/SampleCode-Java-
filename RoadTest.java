//クラスの拡張
class Road extends Polyline {
    String name;
    Road(int n, int[] xx, int[] yy, String s) {
        super(n,xx,yy);     //スーパークラスの呼び出し（super、コンストラクタ定義の先頭に記述、デフォルトコンストラクタが必ず呼び出される）
        name=new String(s); //独自に追加された情報name
    }

    void print() {
        System.out.println("Name="+name);  //道路名の出力
        super.print();      //スーパークラスのメソッドの呼び出し（super、メソッド内のどこでも記述可、オーバーライド）
    }
}
class RoadTest {
    public static void main(String[] args) {
        int n=3;
        int[] x={0,5,5}, y={0,0,10};
        Road a=new Road(n,x,y,"road-1");    //コンストラクタ呼び出し
        a.print();
        double leng=a.length();
        System.out.println("Length="+leng);
    }
}
