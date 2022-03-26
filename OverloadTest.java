public class OverloadTest {     //multi declaration with same signature
    void value(int i) {
        System.out.println("value(int) called");
    }
    void value(short k) {
        System.out.println("value(short) called");
    }
    void value(int i, int j){
        System.out.println("value(int,int) called");
    }
    void value(long l) {
        System.out.println("value(long) called");
    }
    void value(double d) {
        System.out.println("value(doublle) called");
    }
    void value(float d) {
        System.out.println("value(float) called");
    }
    public static void main(String[] args) {
        OverloadTest obj=new OverloadTest();
        long m=1234567890123L;
        short k=10;
        obj.value(10);
        obj.value(10L);
        obj.value(m);   //calling a variable declared the same type
        obj.value(k);   //calling a variable declared the same type
        obj.value(10,20);
        obj.value(1.234);
        obj.value(1.234F);  //expressing float
    }

}
