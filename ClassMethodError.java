import javax.swing.text.html.InlineView;
//�G���[�̗�
class Involution {
    int val=20;     //�C���X�^���X�ϐ���static�łȂ����߃N���X���\�b�h���ŎQ�Ƃ����s�i�C���X�^���X���\�b�h�����l�j
    public static int square(int i) {
        System.out.printf("val=%d\n",val);      //Error!
        return i*i;
    }
    public static int cube(int i) {
        return i*i*i;
    }
}
class ClassMethodError {
    public static void main(String[] args) {
        int i=5,j;
        Involution.val=10;                      //Error!�i�N���X��.�C���X�^���X�ϐ��͎Q�ƕs�j
        Involution inv=new Involution();
        j=Involution.square(i);
        System.out.printf("%d �~ %d=%d\n",i,i,j);
        j=Involution.cube(i);
        System.out.printf("%d �~ %d �~ %d=%d\n",i,i,i,j);
        j=inv.cube(i);                          //�C���X�^���Xinv���w�肵�ăN���X�֐����Ăяo��
        System.out.printf("%d �~ %d �~ %d=%d\n",i,i,i,j);
    }
}
