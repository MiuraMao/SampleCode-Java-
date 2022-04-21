interface VarietyOut {
    static void print(String msg) {
        System.out.println("print:"+msg);
    }
    default void disp(String msg) {
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
        StringBuffer sb=new StringBuffer(msg);  //ÉÅÉÇÉäå¯ó¶ÇÃó«Ç¢ÉNÉâÉXStringBuffer
        System.out.println("dispB:"+sb.reverse());
    }
}

class VarietyOutSample {
    public static void main(String[] args) {
        VOCA voca=new VOCA();
        VOCB vocb=new VOCB();
        VarietyOut.print("Ç†Ç¢Ç§");
        voca.disp("123");
        voca.output("abc");
        vocb.disp("123");
        vocb.output("abc");
    }
}