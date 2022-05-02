//�o�C�g�f�[�^�̃t�@�C���o��
//try-with-resources�����g��Ȃ��ꍇ��finally�߂�close()���Ăяo���K�v������
//close()�ł���O����������\�������邽��try-catch���������K�v������
import java.io.*;
class ByteStreamOutput {
    public static void main(String[] args) {
        int[] d={1,2,3,4,5};
        try(DataOutputStream bout=new DataOutputStream( //try-with-resources���i�G���[�̗L���ɂ�����炸�I�����Ƀt�@�C���N���[�Y�j
                                  new BufferedOutputStream(
                                  new FileOutputStream("binfile.dat")))){   
            for(int i=0; i<d.length; i++)
                bout.writeInt(d[i]);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
