import java.util.*;
public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String,Integer> hmap=new HashMap<>();   //HashMap�̑��̌^�͂Q�̌^�w�肪�K�v
        hmap.put("�R�c���Y",25);
        hmap.put("��؈�Y",30);
        hmap.put("�{�c�Ԏq",20);
        hmap.put("�L�c�z�q",22);
        System.out.println("���݂̗v�f���́H:"+hmap.size());
        System.out.println("�����Y�͑��݂���H�F"+hmap.containsKey("�����Y"));
        System.out.println("��؈�Y�͑��݂���H�F"+hmap.containsKey("��؈�Y"));
        int age=hmap.get("�{�c�Ԏq");
        System.out.println("�{�c�Ԏq�̔N��́H�F"+age);
    } 
}
