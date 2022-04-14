//サブクラスのオブジェクトはスーパークラス型の変数に代入できる（逆は不可）
//代入後はスーパークラスのメソッドのみ実行できる
//サブクラスのメソッドを実行したい場合はキャストする
class Cast {
    public static void main(String[] args) {
        ClassP op=new ClassP(10);
        ClassC oc=new ClassC(20,"aaa");
        ClassP oa=oc;           //代入は可
        oa.set(11); oa.print();
        //oa.set(10,"ccc");     //この行はコンパイルエラーとなる
        ((ClassC)oa).set(12,"ccc"); oa.print();     //キャストすればsetを実行可
    }    
}
