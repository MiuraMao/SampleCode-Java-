//�R���p���[�^
import java.util.Comparator;
import java.util.Arrays;

class Person {
    String name;
    String yomi;
    int age;

    Person(String name,String yomi,int age) {
        this.name=name;
        this.yomi=yomi;
        this.age=age;
    }
}

class PersonComparator implements Comparator<Person> {      //�R���p���[�^�ipublic int compare�̎�����v������j
    public int compare(Person a,Person b) {     //a.compareTo(b)�Ɠ���
        return a.yomi.compareTo(b.yomi);
    }
}

class SortByComparator {
    public static void main(String[] args) {
        Person[] ary=new Person[4];
        ary[0]=new Person("�R�c�@�Ԏq","��܂��@�͂Ȃ�",20);
        ary[1]=new Person("��؁@��Y","�������@�����낤",21);
        ary[2]=new Person("�����@�W","�ӂ����@������",20);
        ary[3]=new Person("�����@�z�q","���񂶁@�悤��",22);
        Comparator<Person> comp=new PersonComparator();
        Arrays.sort(ary,comp);
        for(int i=0; i<ary.length; i++) {
            System.out.printf("%s\t %2d\n",ary[i].name,ary[i].age);
        }
    }
}
