import java.io.*;

class ReadTest {
    public static void main(String[] args) {
        try {
            while(true) {
                int d=System.in.read();     //ƒRƒ“ƒ\[ƒ‹•¶š“ü—Í
                if(d=='\n') break;
                System.out.print(d);
            }
        } catch(IOException e) {
            System.err.println(e);
        }
    }
}