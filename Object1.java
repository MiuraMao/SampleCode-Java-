//Objectクラスの例
class A {
    protected int i;
    protected String s;
    public String toString() {
    return "("+i+") :"+s;        
    }
    public boolean equals(A obj) {              //equalsメソッドをオーバーライド
        if(this.i==obj.i && this.s.equals(obj.s)) return true;
        else return false;
    }
}
class Object1 {
    public static void main(String [] args) {
        A ins=new A(); ins.i=10; ins.s="abcdefg";
        A cpy=ins;
        System.out.println(ins.getClass());     //関連づけられているオブジェクトが属すクラスを返す
        System.out.println(ins.toString());     //オブジェクトの内容を文字列変換
        System.out.println(ins);                //toStringを省略しても暗黙的に呼び出される
        A oth=new A(); oth.i=10; oth.s="abcdefg";
        if(ins == cpy)      //同一オブジェクトのため真（値の比較ではない）
            System.out.println("ins と cpy は等しい");
        else
            System.out.println("ins と cpy は異なる");
        if(ins == oth)      //値は同じだが異なるオブジェクトのため偽
            System.out.println("ins と oth は等しい");
        else
            System.out.println("ins と oth は異なる");
        if(ins.equals(oth)) //内容の真偽判定
            System.out.println("ins と oth は内容が同じ");
        else
            System.out.println("ins と oth は内容が異なる");
    }
    
}
