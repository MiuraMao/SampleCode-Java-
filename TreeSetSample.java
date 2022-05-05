import java.util.*;
class TreeSetSample {
    public static void main(String[] args) {
        TreeSet<Integer> s=new TreeSet<>();     //TreeSetはSet型のコレクションクラスのインターフェース
        int[] data={6,5,5,4,7,1};           //同じ値は追加されない
        for(int i=0; i<data.length;i++) {
            System.out.println("Add data["+i+"]"+data[i]);
            s.add(data[i]);
            System.out.println("size="+s.size());
        }
    }
}
