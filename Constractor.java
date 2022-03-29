/*デフォルトのコンストラクタが作成されない例*/
class Constractor {
    public static void main(String[] args) {
        SomeObject a=new SomeObject(10,20);
        SomeObject b=new SomeObject();          //引数なしのコンストラクタ(引数ありコンストラクタが定義されているためエラー)
    }
}
class SomeObject {
    int i, j;
    SomeObject(int a, int b){
        i=a; j=b;
    }
}