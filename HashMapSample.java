import java.util.*;
public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String,Integer> hmap=new HashMap<>();   //HashMapの総称型は２つの型指定が必要
        hmap.put("山田太郎",25);
        hmap.put("鈴木一郎",30);
        hmap.put("本田花子",20);
        hmap.put("豊田陽子",22);
        System.out.println("現在の要素数は？:"+hmap.size());
        System.out.println("中川一郎は存在する？："+hmap.containsKey("中川一郎"));
        System.out.println("鈴木一郎は存在する？："+hmap.containsKey("鈴木一郎"));
        int age=hmap.get("本田花子");
        System.out.println("本田花子の年齢は？："+age);
    } 
}
