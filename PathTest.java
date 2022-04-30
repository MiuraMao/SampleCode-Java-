import java.nio.file.*;
class PathTest {
    public static void main(String[] args) {
        if(args.length==0) {
            System.out.println("Use: java PathTest <file-name>");   //�t�@�C�������R�}���h�����Ŏw��
            System.exit(0);
        }
        Path p=Paths.get(args[0]);      //�R�}���h�������󂯎��
        Path ap=p.toAbsolutePath();
        System.out.println("Absolute Path="+ap);
        int nc=ap.getNameCount();       //�p�X�̃��[�g���牽�i�t�H���_�����ǂ邩�J�E���g
        System.out.println("Name Count="+nc);
        Path pp=ap.getParent();
        System.out.println("Parent Path="+pp);
    }
}
