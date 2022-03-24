public class VariableArgments {
    static void func(int...args) {
        System.out.println("引数の個数："+args.length); //可変長引数は配列
        for(int i=0; i<args.length; i++)
            System.out.printf("[%d] %d\n",i,args[i]);
    }
    public static void main(String[] args) {
        func(11);
        func(21,22);
        func(31,32,33);
    }
}
