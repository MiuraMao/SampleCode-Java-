/*�����̌^���قȂ�R���X�g���N�^�̑��d��`�iOverload�j*/
/*�f�t�H���g�R���X�g���N�^�͈��������R���X�g���N�^���������ɍ쐬�����*/
class ClassB {
    int vali;
    double vald;
    String vals;
    ClassB(int i) {
        vali=i;         //�����ݒ肵�Ȃ��ꍇ�f�t�H���g�l��0
    }
    ClassB(double d) {
        vald=d;         //�����ݒ肵�Ȃ��ꍇ�f�t�H���g�l��0
    }
    ClassB(String s) {
        vals=s;         //�����ݒ肵�Ȃ��ꍇ�f�t�H���g�l��null
    }
    public void printVals() {
        System.out.printf("vali=%d, vald=%f, vals=%s\n",vali,vald,vals);
    }
}
class ConstractorOverload {
    public static void main(String[] args) {
        ClassB c0,c1,c2;
        c0=new ClassB(10);
        c1=new ClassB(1.414);
        c2=new ClassB("������̑��");
        c0.printVals();
        c1.printVals();
        c2.printVals();
    }
}