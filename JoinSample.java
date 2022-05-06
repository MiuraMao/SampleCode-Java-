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
            ary[i]=(int)(1000*Math.random());   //0.0�ȏ�1.0����
        Arrays.sort(ary);
        com.median=ary[DATA_NUMBER/2];
    }
}
class JoinSample {
    public static void main(String[] args) {
        CommonData com=new CommonData();
        SubThread th=new SubThread(com);
        try {
            th.join();      //�X���b�h�̏I����҂i��O�������K�v�j
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Median="+com.median);   //join�ŃT�u�X���b�h�̏I����҂��Ȃ���com�̒l����������O�ɂ��̃R�[�h�����s����Ă��܂�
    }
}
