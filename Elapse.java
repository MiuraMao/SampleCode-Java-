//�\�[�g�̎��s���Ԃ��v��
import java.util.Arrays;
class Elapse {
    public static void main(String[] args) {
        final int DATA_NUMBER=100000;
        double ary[]=new double[DATA_NUMBER];
        for(int i=0; i<DATA_NUMBER; i++)
            ary[i]=Math.random();
        long start=System.currentTimeMillis();      //���ݎ�����Ԃ�
        Arrays.sort(ary);
        long end=System.currentTimeMillis();
        System.out.println("time="+(end-start)+" ms"); 

    } 
}
