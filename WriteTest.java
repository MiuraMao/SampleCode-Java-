import java.io.*;
class WriteTest {
    public static void main(String[] args) {
        PrintStream pw=null;
        try {           //�R���X�g���N�^�ȊO�͗�O���X���[���Ȃ����߁Aboolean checkError()�ŃX�g���[���̓��e���t�@�C���ɏ����o���A�G���[���m�F�ł���
            pw=new PrintStream("testtext.txt"); //�t�@�C�����𒼐ڎw��iScanner�͕�����������Ƃ��邱�Ƃ͂ł���j
        } catch(IOException e) {
            System.out.println("�t�@�C���G���[");
        } 
        pw.println("�v�����g�X�g���[����p���������̏o��");
        pw.close();     //�t�@�C���̃N���[�Y�܂���flush()���Ăяo���Ǝ��ۂɏ������݂��s�킹�邱�Ƃ��ł���
    }
}
