//インターフェースに定義されているすべてのメソッドがクラスで実装されなければならない
interface TwoMethods {
    void disp();
    void setValue(int i);
}
class NotOverrideMethod implements TwoMethods {     //コンパイルエラー
    int value;
    @Override
    public void setValue(int i)  {
        value=i;
    }
}
