public class EnumSample {
    enum Branch {TOKYO, KANSAI, HOKKAIDO, KYUSYU}
    public static void main(String[] args){
        Branch place;
        place=Branch.TOKYO;
        System.out.println("場所は:"+place);
        switch(place){
        case TOKYO:                                     //case定数式には要素名のみ
                System.out.println("東京本社です"); break;
        case KANSAI:
                System.out.println("関西支社です"); break;
        case HOKKAIDO:
                System.out.println("北海道支社です"); break;
        case KYUSYU:
                System.out.println("九州支社です"); break;
        }
        place = Branch.KYUSYU;
        if(place==Branch.TOKYO)                             //if文ではenum型名も指定
            System.out.println("本社です");
        else
            System.out.println("支社です");
    }    
}
