//instanceof�łǂ̃N���X�̃C���X�^���X���������Ă��邩�m�F����
class InstanceofTest {
    public static void main(String [] args) {
        ClassP[] ary=new ClassP[3];
        ary[0]=new ClassP(10);
        ary[1]=new ClassC(20,"aaa");    //instanceof�ŃX�[�p�[�N���X���w�肵�Ă��^
        ary[2]=ary[1];  //ClassC�̃C���X�^���X�����Ainstanceof�Ł[�p�[�N���X���w�肵�Ă��^
        for(int i=0; i<3; i++) {
            if(ary[i] instanceof ClassP)
                System.out.printf("ary[%d]�̃C���X�^���X��ClassP\n",i);
            if(ary[i] instanceof ClassC)
                System.out.printf("ary[%d]�̃C���X�^���X��ClassC\n",i);
        }
    }    
}
