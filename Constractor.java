/*�f�t�H���g�̃R���X�g���N�^���쐬����Ȃ���*/
class Constractor {
    public static void main(String[] args) {
        SomeObject a=new SomeObject(10,20);
        SomeObject b=new SomeObject();          //�����Ȃ��̃R���X�g���N�^(��������R���X�g���N�^����`����Ă��邽�߃G���[)
    }
}
class SomeObject {
    int i, j;
    SomeObject(int a, int b){
        i=a; j=b;
    }
}