import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.chrono.*;
public class CalendarSample {
    public static void main(String[] args) {
        Instant now=Instant.now();                      //�O���j�b�W�W����
        System.out.println(now);
        LocalDateTime ins=LocalDateTime.now();          //���ݒn�̓���
        System.out.println(ins);
        System.out.println(ins.getYear()+"�N"
                            +ins.getMonth().getValue()+"��"     //getMonth()�݂̂��Ɖp��\�L�Ŏ擾�����
                            +ins.getDayOfMonth()+"��"
                            +ins.getHour()+"��"
                            +ins.getMinute()+"��"
                            +ins.getSecond()+"�b");
        String fins=ins.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(fins);
        LocalDateTime ldt=LocalDateTime.parse("2010-01-20T13:40:50");   //�C�ӂ̎��Ԃ��w��
        String fldt=ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(fldt);
        JapaneseDate jins=JapaneseDate.now();       //�N���\���i���[�}���j
        System.out.println(jins);
    }
}