import java.util.*;
class FromString {
    public static void main(String[] args) {
        String str="1.23 6.54";
        Double a,b;
        Scanner kin=new Scanner(str);   //String�^�I�u�W�F�N�g�i������j���R���X�g���N�^�̈����Ɏw��
        a=kin.nextDouble(); System.out.println("a="+a);
        b=kin.nextDouble(); System.out.println("b="+b);
        System.out.println(a+"+"+b+"="+(a+b));
    }
}
