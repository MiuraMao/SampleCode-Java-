//�I�[�o�[���C�h�̌��
class NewClass {
    public String tostring() {      //�R���p�C���G���[�ƂȂ�Ȃ��itostring�Ƃ����Ǝ��̃N���X���`�������ƂɂȂ�j
        return "�V�����N���XNewClass��Object";
    }
}
class Annotation {
    public static void main(String[] args) {
        NewClass c=new NewClass();
        System.out.println(c);      //Object�N���X��toString()�̌��ʂ��\�������
    }
}
