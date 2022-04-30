import java.io.*;
class WriteTest {
    public static void main(String[] args) {
        PrintStream pw=null;
        try {           //コンストラクタ以外は例外をスローしないため、boolean checkError()でストリームの内容をファイルに書き出し、エラーを確認できる
            pw=new PrintStream("testtext.txt"); //ファイル名を直接指定（Scannerは文字列を引数とすることはできる）
        } catch(IOException e) {
            System.out.println("ファイルエラー");
        } 
        pw.println("プリントストリームを用いた文字の出力");
        pw.close();     //ファイルのクローズまたはflush()を呼び出すと実際に書き込みを行わせることができる
    }
}
