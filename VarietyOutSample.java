//同名、同型と数の引数を持つインターフェースが複数あってもエラーとならない
//インターフェースのフィールドが同名の場合はエラー
interface VarietyOut {
    static void print(String msg) {
        System.out.println("print:"+msg);
    }
    default void disp(String msg) {     //defaultのメソッドはオーバーライドされない場合そのまま承継
        System.out.println("disp:"+msg);
    }
    void output(String msg);
}

class VOCA implements VarietyOut {
    public void output(String msg) {
        System.out.println("outputA:"+msg);
    }
}

class VOCB implements VarietyOut {
    public void output(String msg) {
        System.out.println("outputB:"+msg.toUpperCase());
    }
    public void disp(String msg) {
        StringBuffer sb=new StringBuffer(msg);  //メモリ効率の良いクラスStringBuffer
        System.out.println("dispB:"+sb.reverse());
    }
}

class VarietyOutSample {
    public static void main(String[] args) {
        VOCA voca=new VOCA();
        VOCB vocb=new VOCB();
        VarietyOut.print("あいう");
        voca.disp("123");
        voca.output("abc");
        vocb.disp("123");
        vocb.output("abc");
    }
}