/*�Ӑ}�����Ƃ���ɓ��삵�Ȃ�*/
class Swap1 {
    static void swap(int i, int j); {   //���̃��\�b�h�͐����������Ȃ��I
        int temp;
        temp=i; i=j; j=temp;
    }
    public static void main(String[] args) {
        int i=5, j=10;
        System.out.println("Before swap: i="+i+"  j="+j);
        swap(i,j);
        System.out.println("After swap:   i="+i+"  j="+j);
    }
}
