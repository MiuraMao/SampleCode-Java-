import java.util.*;
import java.nio.file.*;
class FromFile {
    public static void main(String[] args) {
        int i,j,k;
        try {
            Path path=Paths.get("test.txt");  //��O�𔭐�������\��������
            Scanner kin=new Scanner(path);          //Scanner�^�̃I�u�W�F�N�g�쐬����Path�^�̈�����n��
            i=kin.nextInt(); System.out.println("i="+i);
            j=kin.nextInt(); System.out.println("j="+j);
            k=i+j;
            System.out.println(i+"+"+j+"="+k);
        }
        catch(Exception e) {
            System.out.println("���͎��G���[");
        }
    }
}
/*��؂蕶���̕ύX*/
//kin.useDelimiter("\\s*,\\s*");    //�J���}����؂蕶���Ɏw��i�O���0�ȏ�̋󔒕������܂ށj
//kin.userDelimiter("\\r\\n");      //Windows�̉��s����؂蕶���Ɏw��
//sc.useDelimiter("\\p{javaWhitespace}+");  //�󔒕�������؂蕶���Ɏw�肵�Ȃ���