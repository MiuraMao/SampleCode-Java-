import java.util.*;
class StackSample {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        int val=stk.peek();     //�l��ǂݎ���Ă��邾���ŁA���o���Ă��Ȃ�
        System.out.println("Peek: "+val);
        int pos=stk.search(10);     //�X�^�b�N�̍ŏオ�P�̒l
        System.out.println("10�̈ʒu��: "+pos);
        while(stk.empty()==false) {
            val=stk.pop();
            System.out.println(val+" poped");
        }
    }
}
