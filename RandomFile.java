//�����_���A�N�Z�X�t�@�C��
import java.io.*;
class RandomFile {
    public static void main(String[] args) {
        long[] posary=new long[10];
        int[] idata={10,9,8,7,6,5,4,3,2,1};
        try(RandomAccessFile rf=new RandomAccessFile("radata.dat","rw")) {
            //�܂��f�[�^����������
            for(int i=0; i<10; i++) {
                posary[i]=rf.getFilePointer();  //int�^�̂���4�o�C�g�����Ɉٓ�
                rf.writeInt(idata[i]);

            } 
            //�t���Ƀf�[�^��T���Ȃ���ǂݍ���
            for(int i=9; i>=0; i--) {
                rf.seek(posary[i]);             //�ǂݍ��݈ʒu�̎w��i�o�C�g��̐擪�Ɉړ��j
                int val=rf.readInt();
                System.out.printf("i=%2d, val=%3d\n",i,val);
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
