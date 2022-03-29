/*シグネチャが異なる複数のコンストラクタ*/
/*コンストラクタはreturn文で値を返さない。また、戻り値をvoidとしてはならない*/
class ClassA {
    int vala;
    int valb;
    ClassA() {
        vala=0; valb=0;
        System.out.println("引数なしのコンストラクタ");
    }
    ClassA(int i) {
        vala=i; valb=0;
        System.out.println("引数１個のコンストラクタ");
    }
    ClassA(int i, int j) {
        vala=i; valb=j;
        System.out.println("引数２個のコンストラクタ");
    }
    public void printVals() {
        System.out.printf("vala=%d, valb=%d\n",vala,valb);
    }
}
class ConstractorSample {
    public static void main(String[] args) {
        ClassA c0, c1,c2;
        c0=new ClassA();        //インスタンス生成
        c1=new ClassA(10);
        c2=new ClassA(5,20);
        c0.printVals();         //フィールド値の確認
        c1.printVals();
        c2.printVals();
    }
}