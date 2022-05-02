import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.chrono.*;
public class CalendarSample {
    public static void main(String[] args) {
        Instant now=Instant.now();                      //グリニッジ標準時
        System.out.println(now);
        LocalDateTime ins=LocalDateTime.now();          //現在地の日時
        System.out.println(ins);
        System.out.println(ins.getYear()+"年"
                            +ins.getMonth().getValue()+"月"     //getMonth()のみだと英語表記で取得される
                            +ins.getDayOfMonth()+"日"
                            +ins.getHour()+"時"
                            +ins.getMinute()+"分"
                            +ins.getSecond()+"秒");
        String fins=ins.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(fins);
        LocalDateTime ldt=LocalDateTime.parse("2010-01-20T13:40:50");   //任意の時間を指定
        String fldt=ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(fldt);
        JapaneseDate jins=JapaneseDate.now();       //年号表示（ローマ字）
        System.out.println(jins);
    }
}