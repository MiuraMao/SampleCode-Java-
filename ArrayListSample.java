import java.util.*;
import java.util.List;
class ArrayListSample {
    public static void main(String[] args) {
        List<String> ary=new ArrayList<>();     //ListはArrayListに実装されているインターフェース
        ary.add("aaa");
        ary.add("bbb");
        ary.add("ccc");
        System.out.println("3つのオブジェクトを追加");
        for(int i=0; i<ary.size(); i++)
            System.out.print(ary.get(i)+" ");   //getで指定された位置のオブジェクトを得る
        ary.add(1,"ddd");
        System.out.println("\ndddを2番目に挿入");
        for(int i=0; i<ary.size(); i++)
            System.out.print(ary.get(i)+" ");
        ary.remove(2);      //"bbb"を削除
        System.out.println("\nbbbを削除");
        for(int i=0; i<ary.size(); i++)
            System.out.print(ary.get(i)+" ");
        boolean yn=ary.contains("ccc");     //ArrayListに含まれているか検索
        System.out.println("\ncccがaryに含まれるか？ "+yn);
    }
}
