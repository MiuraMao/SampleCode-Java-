//�N���X�̊g��
class Road extends Polyline {
    String name;
    Road(int n, int[] xx, int[] yy, String s) {
        super(n,xx,yy);     //�X�[�p�[�N���X�̌Ăяo���isuper�A�R���X�g���N�^��`�̐擪�ɋL�q�A�f�t�H���g�R���X�g���N�^���K���Ăяo�����j
        name=new String(s); //�Ǝ��ɒǉ����ꂽ���name
    }

    void print() {
        System.out.println("Name="+name);  //���H���̏o��
        super.print();      //�X�[�p�[�N���X�̃��\�b�h�̌Ăяo���isuper�A���\�b�h���̂ǂ��ł��L�q�A�I�[�o�[���C�h�j
    }
}
class RoadTest {
    public static void main(String[] args) {
        int n=3;
        int[] x={0,5,5}, y={0,0,10};
        Road a=new Road(n,x,y,"road-1");    //�R���X�g���N�^�Ăяo��
        a.print();
        double leng=a.length();
        System.out.println("Length="+leng);
    }
}
