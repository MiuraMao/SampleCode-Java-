class SomeClass<T> {
    T data;     //T:�^���̂���ϐ��̂悤�Ɉ���
    public SomeClass(T d) {
        data=d;
    }
    public void print() {
        System.out.println("Data="+data);
    }
}
class GenericSample {
    public static void main(String[] args) {
        SomeClass<Integer> idata=new SomeClass<Integer>(10);    //�E���̌^�����̓��e�͏ȗ��i<>:�_�C�A�����h���Z�q�j
        SomeClass<Double> ddata=new SomeClass<Double>(20.0);
        SomeClass<String> sdata=new SomeClass<String>("Japan");
        idata.print();
        ddata.print();
        sdata.print();
    }
}
