//���̌^�N���X�̌���K�p
class GenClass<T extends CharSequence> {    //length���\�b�h������CharSequence�A�܂��͂�����g�������N���X�Ɍ���
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
//        GenClass<Integer> gi=new GenClass<>(10);  //CharSequence�̃T�u�N���X�łȂ����߃G���[
//2�̕ϐ�gs��gss���ȉ��̂悤�ɂ܂Ƃ߂邱�Ƃ��ł���
//GenClass <? extends CharSequence> g;
    }    
}
