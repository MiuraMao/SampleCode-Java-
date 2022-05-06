import java.util.Arrays;

class CommonData {
    int median;
}
class SubThread extends Thread {
    private final int DATA_NUMBER=1001;
    CommonData com;
    public SubThread(CommonData c) {
        com=c;
        start();
    } 
    public void run() {
        int[] ary=new int[DATA_NUMBER];
        for(int i=0; i<DATA_NUMBER; i++)
            ary[i]=(int)(1000*Math.random());   //0.0以上1.0未満
        Arrays.sort(ary);
        com.median=ary[DATA_NUMBER/2];
    }
}
class JoinSample {
    public static void main(String[] args) {
        CommonData com=new CommonData();
        SubThread th=new SubThread(com);
        try {
            th.join();      //スレッドの終了を待つ（例外処理が必要）
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Median="+com.median);   //joinでサブスレッドの終了を待たないとcomの値が代入される前にこのコードが実行されてしまう
    }
}
