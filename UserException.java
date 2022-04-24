//��`���ꂽ���\�b�h���Ăяo���ꍇ�A�Ăяo������try-catch�����L�q���邩�A�Ăяo������throw���Ȃ���΂Ȃ�Ȃ�
//Java�Ŋ��ɒ�`����Ă����O��throw���邱�Ƃ��\
//��Fthrow new ArithmeticException();
class NewException extends Exception {
    int value;
    NewException(int v) {
        value=v;
    }
    public String toString() {      //�I�[�o�[���C�h
        return "NewException "+value;
    }
}
class UserException {
    public static void main(String[] args) {
        try {
            for(int i=3; i>=0; i--) 
                checkZero(i);
        }
        catch(NewException e) {
            System.out.println("Exception "+e);
        }
    }
    static void checkZero(int value) throws NewException {
        if(value==0)
            throw new NewException(value);      //�Ăяo������throw
        else
            System.out.println("No problem");
    }
}
