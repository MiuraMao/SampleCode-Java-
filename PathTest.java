import java.nio.file.*;
class PathTest {
    public static void main(String[] args) {
        if(args.length==0) {
            System.out.println("Use: java PathTest <file-name>");   //ファイル名をコマンド引数で指定
            System.exit(0);
        }
        Path p=Paths.get(args[0]);      //コマンド引数を受け取る
        Path ap=p.toAbsolutePath();
        System.out.println("Absolute Path="+ap);
        int nc=ap.getNameCount();       //パスのルートから何段フォルダをたどるかカウント
        System.out.println("Name Count="+nc);
        Path pp=ap.getParent();
        System.out.println("Parent Path="+pp);
    }
}
