//ラッパークラス
class IntegerClassSample {
    public static void main(String[] args) {
        System.out.println("intの最大値は："+Integer.MAX_VALUE);
        System.out.println("intの最小値は："+Integer.MIN_VALUE);
        Integer k=Integer.valueOf(123);     //new Integer(123)は推奨されない
        Integer m=Integer.valueOf("321");   //new Integer("321")は推奨されない
        System.out.printf("k=%d, m=%d\n",k,m);
        int iMin=Integer.min(15,25);
        int iMax=Integer.max(15,25);
        System.out.printf("iMin=%d, iMax=%d\n",iMin,iMax);
        Integer n=Integer.valueOf("101");
        System.out.println("n="+n);
    }    
}
