//定義されたメソッドを呼び出す場合、呼び出し元でtry-catch文を記述するか、呼び出し元へthrowしなければならない
//Javaで既に定義されている例外をthrowすることも可能
//例：throw new ArithmeticException();
class NewException extends Exception {
    int value;
    NewException(int v) {
        value=v;
    }
    public String toString() {      //オーバーライド
        return "NewException "+value;
    }
}
class UserException {
    public static void main(String[] args) {
        try {
            for(int i=3; i>=0; i--) 
                checkZero(i);
        }
        catch(NewException e) {
            System.out.println("Exception "+e);
        }
    }
    static void checkZero(int value) throws NewException {
        if(value==0)
            throw new NewException(value);      //呼び出し元へthrow
        else
            System.out.println("No problem");
    }
}
