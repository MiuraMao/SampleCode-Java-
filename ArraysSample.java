//Arraysメソッドはstaticのため、オブジェクトを作成せず使用可能
import java.lang.reflect.Array;
import java.util.*;
class ArraysSample {
    public static void main(String[] args) {
        int[] data={5,7,2,8,4,1,9,6};
        printAll("Before-sort:",data);
        Arrays.sort(data);                  //昇順にソート
        printAll("After-sort :",data);
        System.out.println("5 is at "+Arrays.binarySearch(data,5)+" in data");
        System.out.println("3 is at "+Arrays.binarySearch(data,3)+" in data");  //存在しない場合はマイナス値を返す
    }
    private static void printAll(String s, int[] ary) {
        System.out.println(s);
        for(int i=0; i<ary.length; i++) 
            System.out.print(" "+ary[i]);
        System.out.println();
    }
}
