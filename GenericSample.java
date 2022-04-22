class SomeClass<T> {
    T data;     //T:型自体をを変数のように扱う
    public SomeClass(T d) {
        data=d;
    }
    public void print() {
        System.out.println("Data="+data);
    }
}
class GenericSample {
    public static void main(String[] args) {
        SomeClass<Integer> idata=new SomeClass<Integer>(10);    //右側の型引数の内容は省略可（<>:ダイアモンド演算子）
        SomeClass<Double> ddata=new SomeClass<Double>(20.0);
        SomeClass<String> sdata=new SomeClass<String>("Japan");
        idata.print();
        ddata.print();
        sdata.print();
    }
}
