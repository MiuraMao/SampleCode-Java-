import java.io.*;
class ReadTest2 {
    public static void main(String[] args) {
        byte[] buf=new byte[80];
        int d=0;
        try {
            while((d=System.in.read(buf,0,80)) > 0) {   //EOF�iCtrl+Z�j��d�̒l��-1�ƂȂ�I��
                String s=new String(buf,0,d);
                System.out.println("���̓o�C�g��="+d+", ���͕�����:"+s);    //���s�����Q�o�C�g�����t�������
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
