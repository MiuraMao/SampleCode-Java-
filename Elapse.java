//�\�[�g�̎��s���Ԃ��v��
import java.util.Arrays;
class Elapse {
    public static void main(String[] args) {
        final int DATA_NUMBER=100000;
        double ary[]=new double[DATA_NUMBER];
        for(int i=0; i<DATA_NUMBER; i++)
            ary[i]=Math.random();
        long start=System.currentTimeMillis();      //���ݎ�����Ԃ��i�O���j�b�W�W����1970�N1��1��0��0��0�b�j
        Arrays.sort(ary);
        long end=System.currentTimeMillis();        //Instant.now()�ł��擾�ł���
        System.out.println("time="+(end-start)+" ms"); 

    } 
}
//�i�m�b�ő��肷��ꍇ
//long System.nanoTime()

