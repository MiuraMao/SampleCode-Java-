import java.util.*;
import java.util.List;
//Stream�͏����𑽒i�ɘA�����ċL�q����
class SortString {
    public static void main(String[] args) {
        List<String> lst=Arrays.asList("Cicago","Tokyo","London",   //asList���\�b�h�ň����̕������List�^�I�u�W�F�N�g�ɕϊ�
                                            "Paris","Berlin",
                                            "NewYork","Kyoto","Rome",
                                            "Bankok","Frankfurt");
        lst.stream().sorted().forEach(s->System.out.println(s));    //�X�g���[���̓��\�b�h���u.�v�Ō���
        //�ȉ��̂悤�ɏ������Ƃ��ł���
        //lst.stream().sorted().forEach(System.out::println);       //���\�b�h�Q�ƂƌĂ΂��L�@
    }
}
