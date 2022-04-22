import java.util.Comparator;
import java.util.Arrays;

//Lambda式：関数型インターフェイス
//Comparatorインターフェイスは抽象メソッドcompareのみを持つ関数型インターフェイスである
class LambdaSample {
    public static void main(String... args) {
        Person[] ary=new Person[4];
        ary[0]=new Person("山田　花子","やまだ　はなこ",20);
        ary[1]=new Person("鈴木　一郎","すずき　いちろう",21);
        ary[2]=new Person("藤原　晋","ふじわら　すすみ",20);
        ary[3]=new Person("源氏　陽子","げんじ　ようこ",22);
        Arrays.sort(ary,
                    (a,b) -> a.yomi.compareTo(b.yomi)           //Lambda式
                    );
        //Arrays.sortメソッドはシグネチャの異なる多数がオーバーロードされているが、ここでは
        //Public static <T> void sort(T[] a, Comparator<? super T> c)である
        for(int i=0; i<ary.length; i++)
            System.out.printf("%s\t %2d\n",ary[i].name,ary[i].age);
    }
}
