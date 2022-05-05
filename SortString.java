import java.util.*;
import java.util.List;
//Streamは処理を多段に連結して記述する
class SortString {
    public static void main(String[] args) {
        List<String> lst=Arrays.asList("Cicago","Tokyo","London",   //asListメソッドで引数の文字列をList型オブジェクトに変換
                                            "Paris","Berlin",
                                            "NewYork","Kyoto","Rome",
                                            "Bankok","Frankfurt");
        lst.stream().sorted().forEach(s->System.out.println(s));    //ストリームはメソッドを「.」で結ぶ
        //以下のように書くこともできる
        //lst.stream().sorted().forEach(System.out::println);       //メソッド参照と呼ばれる記法
    }
}
