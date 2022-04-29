import java.io.*;
class ReadTest2 {
    public static void main(String[] args) {
        byte[] buf=new byte[80];
        int d=0;
        try {
            while((d=System.in.read(buf,0,80)) > 0) {   //EOF（Ctrl+Z）でdの値が-1となり終了
                String s=new String(buf,0,d);
                System.out.println("入力バイト数="+d+", 入力文字列:"+s);    //改行文字２バイト分が付加される
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
