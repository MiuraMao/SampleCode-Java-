import static java.lang.Math.*;         //*�͑S�ẴN���X�܂��փ��\�b�h��t�B�[���h
import static java.lang.System.out;     //static��t���邱�ƂŃN���X�����ȗ��ł���
class StaticImport {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            double d=sin(toRadians(i*10));  //sin�AtoRadians��Math���\�b�h���ȗ����ČĂяo��
            out.printf("sin(%d)=%4.2f\n",i*10,d);   //�N���X�t�B�[���hSystem.out���N���X�����ȗ����ČĂяo��
        }
    }
}