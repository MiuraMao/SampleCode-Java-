//instanceofでどのクラスのインスタンスが代入されているか確認する
class InstanceofTest {
    public static void main(String [] args) {
        ClassP[] ary=new ClassP[3];
        ary[0]=new ClassP(10);
        ary[1]=new ClassC(20,"aaa");    //instanceofでスーパークラスを指定しても真
        ary[2]=ary[1];  //ClassCのインスタンスを代入、instanceofでーパークラスを指定しても真
        for(int i=0; i<3; i++) {
            if(ary[i] instanceof ClassP)
                System.out.printf("ary[%d]のインスタンスはClassP\n",i);
            if(ary[i] instanceof ClassC)
                System.out.printf("ary[%d]のインスタンスはClassC\n",i);
        }
    }    
}
