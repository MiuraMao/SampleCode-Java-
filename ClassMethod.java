//�N���X���\�b�h�̃��[�U�[��`
class Involution {
    public static int square(int i) {   //�N���X�t�B�[���h�Ɠ��l��static������
        return i*i;
    }
    public static int cube(int i) {     //�N���X�t�B�[���h�Ɠ��l��static������
        return i*i*i;
    }
}

class ClassMethod {
    public static void main(String[] args) {    //main���N���X���\�b�h
        int i=5, j;
        j=Involution.square(i);
        System.out.printf("%d �~ %d=%d\n",i,i,j);
        j=Involution.cube(i);
        System.out.printf("%d �~ %d �~ %d=%d\n",i,i,i,j);
    }
}
