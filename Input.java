//���͏������ȒP�ɂ���Scannner�N���X
import java.util.*;
class Input {
    public static void main(String[] args)  {
        int i,j,k;
        Scanner kin=new Scanner(System.in);
        System.out.print("a? ");
        i=kin.nextInt();        //nextInt()�Fint�^�̒l�̓ǂݍ���
        System.out.print("b? ");
        j=kin.nextInt();
        k=i+j;
        System.out.println(i+"+"+j+"="+k);
    }
}
