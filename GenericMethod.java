class GenericMethod {
    static <T extends Comparable<T>> T minObj(T o1, T o2) { //���̌^�̌���K�p�����\�b�h�Ɏg�p
        return o1.compareTo(o2) < 0 ? o1 : o2;  //������菬�����F-1�A���l�F0�A�傫���F1��Ԃ�
    }
    public static void main(String[] args) {
        String sa="abc";
        String sb="def";
        System.out.println("min: "+minObj(sa,sb));
    }
}
