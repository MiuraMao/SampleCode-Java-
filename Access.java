//privateのフィールドにアクセスできるようにするゲッタとセッタ
class Access {
    private int value;
    public int getValue() { return value;}  //ゲッタ
    public void setValue() {int value} {    //セッタ
        this.value=value;   //フィールドに無効な値が代入されるのをチェックできる
    }    
}
