import java.util.Comparator;
import java.util.Arrays;

//匿名クラスでは名前が無いため、親クラスまたはインターフェイス名でnewする
class AnonymousClass {      //匿名クラス（無名内部クラス）
    public static void main(String[] args) {
        Person[] ary=new Person[4];
        ary[0]=new Person("山田　花子","やまだ　はなこ",20);
        ary[1]=new Person("鈴木　一郎","すずき　いちろう",21);
        ary[2]=new Person("藤原　晋","ふじわら　すすみ",20);
        ary[3]=new Person("源氏　陽子","げんじ　ようこ",22);
        Array.sort(ary,new Comparator<Person>()  {      //Array.sortの第２引数にインターフェイスであるComparatorを指定
            public int compare(Person a, Person b) {
                return a.yomi.compareTo(b.yomi);
            }
        });
        for(int i=0; i<ary.length; i++)
            System.out.printf("%s\t %2d\n",ary[i].name,ary[i].age);
    }    
}
