import java.io.*;

class ReadTest {
    public static void main(String[] args) {
        try {
            while(true) {
                int d=System.in.read();     //コンソール文字入力
                if(d=='\n') break;
                System.out.print(d);
            }
        } catch(IOException e) {
            System.err.println(e);
        }
    }
}