//�C���^�[�t�F�[�X�ɒ�`����Ă��邷�ׂẴ��\�b�h���N���X�Ŏ�������Ȃ���΂Ȃ�Ȃ�
interface TwoMethods {
    void disp();
    void setValue(int i);
}
class NotOverrideMethod implements TwoMethods {     //�R���p�C���G���[
    int value;
    @Override
    public void setValue(int i)  {
        value=i;
    }
}
