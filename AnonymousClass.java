import java.util.Comparator;
import java.util.Arrays;

//�����N���X�ł͖��O���������߁A�e�N���X�܂��̓C���^�[�t�F�C�X����new����
class AnonymousClass {      //�����N���X�i���������N���X�j
    public static void main(String[] args) {
        Person[] ary=new Person[4];
        ary[0]=new Person("�R�c�@�Ԏq","��܂��@�͂Ȃ�",20);
        ary[1]=new Person("��؁@��Y","�������@�����낤",21);
        ary[2]=new Person("�����@�W","�ӂ����@������",20);
        ary[3]=new Person("�����@�z�q","���񂶁@�悤��",22);
        Array.sort(ary,new Comparator<Person>()  {      //Array.sort�̑�Q�����ɃC���^�[�t�F�C�X�ł���Comparator���w��
            public int compare(Person a, Person b) {
                return a.yomi.compareTo(b.yomi);
            }
        });
        for(int i=0; i<ary.length; i++)
            System.out.printf("%s\t %2d\n",ary[i].name,ary[i].age);
    }    
}
