import java.util.*;
class TreeSetSample {
    public static void main(String[] args) {
        TreeSet<Integer> s=new TreeSet<>();     //TreeSet��Set�^�̃R���N�V�����N���X�̃C���^�[�t�F�[�X
        int[] data={6,5,5,4,7,1};           //�����l�͒ǉ�����Ȃ�
        for(int i=0; i<data.length;i++) {
            System.out.println("Add data["+i+"]"+data[i]);
            s.add(data[i]);
            System.out.println("size="+s.size());
        }
    }
}
