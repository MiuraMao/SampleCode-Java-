//内部クラスの宣言にstaticを付けた場合、外部インスタンスを作成せずに利用可能
class A {
    static class B {
        static int v=0;
        int i;
        void print() {System.out.println("i="+i+" v="+v);}
    }
}
class StaticInnerClass {
    public static void main(String[] args) {
        A.B ins1=new A.B();     //外部クラス名.内部クラス名.メンバー名
        ins1.v=2;
        ins1.i=10;
        ins1.print();
        A.B ins2=new A.B();
        ins2.i=20;
        ins2.print();
    }
}
