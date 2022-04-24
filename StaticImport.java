import static java.lang.Math.*;         //*は全てのクラスまたへメソッドやフィールド
import static java.lang.System.out;     //staticを付けることでクラス名も省略できる
class StaticImport {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            double d=sin(toRadians(i*10));  //sin、toRadiansをMathメソッドを省略して呼び出す
            out.printf("sin(%d)=%4.2f\n",i*10,d);   //クラスフィールドSystem.outをクラス名を省略して呼び出す
        }
    }
}