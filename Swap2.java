//クラスオブジェクトはポインタ変数と同じ動作
class Value {
    int i;
    Value(int val) {
        i=val;
    }
}
class Swap2 {
    static void swap(Value a, Value b) {
        int temp;
        temp=a.i; a.i=b.i; b.i=temp;
    }
    public static void main(String[] args) {
        Value ob1=new Value(10);
        Value ob2=new Value(20);
        System.out.println("Before swap: ob1.i="+ob1.i+" ob2.i="+ob2.i);
        swap(ob1,ob2);
        System.out.println("After  swap: ob1.i="+ob1.i+" ob2.i="+ob2.i);
    }
}