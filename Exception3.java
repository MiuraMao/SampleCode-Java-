//例外が発生した関数にtry-catch文が無い場合、呼び出し階層お戻り、初めて見つかるcatch文が実行される
class Exception3 {
    public static void main(String[] args) {
        System.out.println("Main Start");
        a();
        System.out.println("Main End");
    }    
    static void a() {
        System.out.println("a Start");
        try {
            b();
        }
        catch(ArithmeticException e) {      //ここでb()の例外をキャッチできる
            System.out.println("Error: "+e);
        }
        finally {
            System.out.println("a-finally");
        }
        System.out.println("a End");
    }
    static void b() {
        System.out.println("b Start");
        try {
            int a,b=0;
            a=10/b;     //0除算
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+e);
        }
        finally {
            System.out.println("b-finally");
        }
        System.out.println("b End");
    }
}
