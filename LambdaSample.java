import java.util.Comparator;
import java.util.Arrays;

//Lambda���F�֐��^�C���^�[�t�F�C�X
//Comparator�C���^�[�t�F�C�X�͒��ۃ��\�b�hcompare�݂̂����֐��^�C���^�[�t�F�C�X�ł���
class LambdaSample {
    public static void main(String... args) {
        Person[] ary=new Person[4];
        ary[0]=new Person("�R�c�@�Ԏq","��܂��@�͂Ȃ�",20);
        ary[1]=new Person("��؁@��Y","�������@�����낤",21);
        ary[2]=new Person("�����@�W","�ӂ����@������",20);
        ary[3]=new Person("�����@�z�q","���񂶁@�悤��",22);
        Arrays.sort(ary,
                    (a,b) -> a.yomi.compareTo(b.yomi)           //Lambda��
                    );
        //Arrays.sort���\�b�h�̓V�O�l�`���̈قȂ鑽�����I�[�o�[���[�h����Ă��邪�A�����ł�
        //Public static <T> void sort(T[] a, Comparator<? super T> c)�ł���
        for(int i=0; i<ary.length; i++)
            System.out.printf("%s\t %2d\n",ary[i].name,ary[i].age);
    }
}
