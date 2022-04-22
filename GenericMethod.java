class GenericMethod {
    static <T extends Comparable<T>> T minObj(T o1, T o2) { //総称型の限定適用をメソッドに使用
        return o1.compareTo(o2) < 0 ? o1 : o2;  //引数より小さい：-1、同値：0、大きい：1を返す
    }
    public static void main(String[] args) {
        String sa="abc";
        String sb="def";
        System.out.println("min: "+minObj(sa,sb));
    }
}
