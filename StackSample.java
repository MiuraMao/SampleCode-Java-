import java.util.*;
class StackSample {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        int val=stk.peek();     //値を読み取っているだけで、取り出していない
        System.out.println("Peek: "+val);
        int pos=stk.search(10);     //スタックの最上が１の値
        System.out.println("10の位置は: "+pos);
        while(stk.empty()==false) {
            val=stk.pop();
            System.out.println(val+" poped");
        }
    }
}
