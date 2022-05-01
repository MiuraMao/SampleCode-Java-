//最近のJavaではFileクラスではなくFilesクラスの使用を推奨
import java.io.File;
import java.nio.file.*;
import java.nio.file.attribute.*;
class FileTest {
    public static void main(String[] args) throws Exception{
        Path p=Paths.get("test.txt");
        FileTime ft=Files.getLastModifiedTime(p);
        System.out.println("Create time="+ft);
        System.out.println("File? "+Files.isRegularFile(p));
        System.out.println("Directory? "+Files.isDirectory(p));
        System.out.println("Size: "+Files.size(p));
        Path newPath=Paths.get("testCopy.txt");
        Files.copy(p,newPath);
    }
}
