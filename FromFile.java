import java.util.*;
import java.nio.file.*;
class FromFile {
    public static void main(String[] args) {
        int i,j,k;
        try {
            Path path=Paths.get("test.txt");  //例外を発生させる可能性がある
            Scanner kin=new Scanner(path);          //Scanner型のオブジェクト作成時にPath型の引数を渡す
            i=kin.nextInt(); System.out.println("i="+i);
            j=kin.nextInt(); System.out.println("j="+j);
            k=i+j;
            System.out.println(i+"+"+j+"="+k);
        }
        catch(Exception e) {
            System.out.println("入力時エラー");
        }
    }
}
/*区切り文字の変更*/
//kin.useDelimiter("\\s*,\\s*");    //カンマを区切り文字に指定（前後の0個以上の空白文字を含む）
//kin.userDelimiter("\\r\\n");      //Windowsの改行を区切り文字に指定
//sc.useDelimiter("\\p{javaWhitespace}+");  //空白文字を区切り文字に指定しなおす