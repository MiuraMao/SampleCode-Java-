import java.util.*;
import java.util.List;
class ArrayListSample {
    public static void main(String[] args) {
        List<String> ary=new ArrayList<>();     //List��ArrayList�Ɏ�������Ă���C���^�[�t�F�[�X
        ary.add("aaa");
        ary.add("bbb");
        ary.add("ccc");
        System.out.println("3�̃I�u�W�F�N�g��ǉ�");
        for(int i=0; i<ary.size(); i++)
            System.out.print(ary.get(i)+" ");   //get�Ŏw�肳�ꂽ�ʒu�̃I�u�W�F�N�g�𓾂�
        ary.add(1,"ddd");
        System.out.println("\nddd��2�Ԗڂɑ}��");
        for(int i=0; i<ary.size(); i++)
            System.out.print(ary.get(i)+" ");
        ary.remove(2);      //"bbb"���폜
        System.out.println("\nbbb���폜");
        for(int i=0; i<ary.size(); i++)
            System.out.print(ary.get(i)+" ");
        boolean yn=ary.contains("ccc");     //ArrayList�Ɋ܂܂�Ă��邩����
        System.out.println("\nccc��ary�Ɋ܂܂�邩�H "+yn);
    }
}
