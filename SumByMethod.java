public class SumByMethod {
    public static void main(String[] args) {
        int total = sum(1,10);
        System.out.printf("total=%d\n",total);
    }
    static int sum(int from, int to) {
        int total=0;
        for(int i=from; i<=to; i++)
            total=total+i;
        return total;       //return文に出会うかメソッドの最下行の実行終了で呼び出し元に戻る
    }    
}
