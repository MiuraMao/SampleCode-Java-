import java.util.Arrays;

class ArraysSample {
    static void printAry(int[] ary) {
        for(int i=0; i<ary.length; i++)
            System.out.printf("%3d",ary[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] ary={8,4,7,2,5,1};
        System.out.println("Before Sort");
        printAry(ary);
        Arrays.sort(ary);       //�I�u�W�F�N�g�Ԃ̑召��r���s�����@��Arrays�N���X�ɋ�����K�v������
        System.out.println("After Sort");
        printAry(ary);
    }
}
