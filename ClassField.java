/*�N���X�ϐ�*/
class ClassD {
    static int counter;     //�N���X�ϐ�
    ClassD() {
        counter++;          //�C���X�^���X�������x�ɃC���N�������g
    }
    void printCounter() {
        System.out.printf("count=%d\n",counter);
    }
}
class ClassField {
    public static void main(String[] args) {
        ClassD c1,c2,c3;
        c1=new ClassD(); c1.printCounter();
        c2=new ClassD(); c2.printCounter();
        c3=new ClassD(); c3.printCounter();
    }
}