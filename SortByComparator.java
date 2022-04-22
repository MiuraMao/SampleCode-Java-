//コンパレータ
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

class PersonComparator implements Comparator<Person> {      //コンパレータ（public int compareの実装を要求する）
    public int compare(Person a,Person b) {     //a.compareTo(b)と同じ
        return a.yomi.compareTo(b.yomi);
    }
}

class SortByComparator {
    public static void main(String[] args) {
        Person[] ary=new Person[4];
        ary[0]=new Person("山田　花子","やまだ　はなこ",20);
        ary[1]=new Person("鈴木　一郎","すずき　いちろう",21);
        ary[2]=new Person("藤原　晋","ふじわら　すすみ",20);
        ary[3]=new Person("源氏　陽子","げんじ　ようこ",22);
        Comparator<Person> comp=new PersonComparator();
        Arrays.sort(ary,comp);
        for(int i=0; i<ary.length; i++) {
            System.out.printf("%s\t %2d\n",ary[i].name,ary[i].age);
        }
    }
}
