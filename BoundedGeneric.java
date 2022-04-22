//総称型クラスの限定適用
class GenClass<T extends CharSequence> {    //lengthメソッドを持つCharSequence、またはそれを拡張したクラスに限定
    T val;
    GenClass(T val) {
        this.val=val;
    }
    public int length() {
        return val.length();
    }
}

class BoundedGeneric {
    public static void main(String[] args) {
        GenClass<String> gs=new GenClass<>("abc");
        System.out.println("length="+gs.length());
        StringBuffer sb=new StringBuffer("def");
        GenClass<StringBuffer> gss=new GenClass<>(sb);
        System.out.println("length="+gss.length());
//        GenClass<Integer> gi=new GenClass<>(10);  //CharSequenceのサブクラスでないためエラー
//2つの変数gsとgssを以下のようにまとめることができる
//GenClass <? extends CharSequence> g;
    }    
}
