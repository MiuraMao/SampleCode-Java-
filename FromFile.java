import java.util.*;
import java.nio.file.*;
class FromFile {
    public static void main(String[] args) {
        int i,j,k;
        try {
            Path path=Paths.get("test.txt");
            Scanner kin=new Scanner(path);
            i=kin.nextInt(); System.out.println("i="+i);
            j=kin.nextInt(); System.out.println("j="+j);
            k=i+j;
            System.out.println(i+"+"+j+"="+k);
        }
        catch(Exception e) {
            System.out.println("“ü—ÍƒGƒ‰[");
        }
    }
}
