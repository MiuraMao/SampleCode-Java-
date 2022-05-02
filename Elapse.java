//ソートの実行時間を計測
import java.util.Arrays;
class Elapse {
    public static void main(String[] args) {
        final int DATA_NUMBER=100000;
        double ary[]=new double[DATA_NUMBER];
        for(int i=0; i<DATA_NUMBER; i++)
            ary[i]=Math.random();
        long start=System.currentTimeMillis();      //現在時刻を返す（グリニッジ標準時1970年1月1日0時0分0秒）
        Arrays.sort(ary);
        long end=System.currentTimeMillis();        //Instant.now()でも取得できる
        System.out.println("time="+(end-start)+" ms"); 

    } 
}
//ナノ秒で測定する場合
//long System.nanoTime()

