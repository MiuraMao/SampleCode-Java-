//�T�u�N���X�̃I�u�W�F�N�g�̓X�[�p�[�N���X�^�̕ϐ��ɑ���ł���i�t�͕s�j
//�����̓X�[�p�[�N���X�̃��\�b�h�̂ݎ��s�ł���
//�T�u�N���X�̃��\�b�h�����s�������ꍇ�̓L���X�g����
class Cast {
    public static void main(String[] args) {
        ClassP op=new ClassP(10);
        ClassC oc=new ClassC(20,"aaa");
        ClassP oa=oc;           //����͉�
        oa.set(11); oa.print();
        //oa.set(10,"ccc");     //���̍s�̓R���p�C���G���[�ƂȂ�
        ((ClassC)oa).set(12,"ccc"); oa.print();     //�L���X�g�����set�����s��
    }    
}
