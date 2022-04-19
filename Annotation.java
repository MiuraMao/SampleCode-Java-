//オーバーライドの誤り
class NewClass {
    public String tostring() {      //コンパイルエラーとならない（tostringという独自のクラスを定義したことになる）
        return "新しいクラスNewClassのObject";
    }
}
class Annotation {
    public static void main(String[] args) {
        NewClass c=new NewClass();
        System.out.println(c);      //ObjectクラスのtoString()の結果が表示される
    }
}
