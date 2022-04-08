//平方根を求める
class SqrtTable {
    public static void main(String[] args) {
        double res;
        for(double val=1.0; val <= 5.0; val++) {
            res=Math.sqrt(val);     //数学関数（クラスメソッドの呼び出し）
            System.out.printf("val=%3.1f res=%7.4f\n",val,res);
        }
    }    
}
