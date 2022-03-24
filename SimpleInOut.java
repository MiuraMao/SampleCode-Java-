import java.util.Scanner;
public class SimpleInOut {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.print("a？ ");
        int a=cin.nextInt();
        System.out.print("b？ ");
        int b=cin.nextInt();
        System.out.println("sum="+(a+b));
    }
}
