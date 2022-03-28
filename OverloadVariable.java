/*シグネチャが一致するメソッドが無い時、引数が一致する可変長引数のメソッドが呼び出される */
class SomeClass {
    public void func(int... ary) {      //可変長引数のメソッド
        System.out.println("引数の数："+ary.length);
        for(int i=0; i<ary.length; i++) {
            System.out.println("ary["+i+"]="+ary[i]);
        }
    }
    public void func(int i) {
        System.out.println("１引数の func i="+i);
    }
    public void func(int i, int j, int k) {
        System.out.println("３引数の func i="+i+" j="+j+" k="+k);
    }
}

class OverloadVariable {
    public static void main(String... args) {
        SomeClass c=new SomeClass();
        c.func(11);
        c.func(21,22);      //引数の数が２のメソッドは定義されていないため、可変長引数のメソッドが呼び出さる
        c.func(31,32,33);
    }
}
