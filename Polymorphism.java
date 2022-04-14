//オーバーライドによる動的結合
class Polymorphism {
    public static void main(String[] args) {
        ClassP[] ary=new ClassP[4];
        ary[0]=new ClassP(1);
        ary[1]=new ClassC(2,"aaa");
        ary[2]=new ClassP(3);
        ary[3]=new ClassC(4,"bbb");
        for(int i=0; i<4; i++)
            ary[i].print();
    }    
}
