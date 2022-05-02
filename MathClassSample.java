//数学関数
class MathClassSample {
    public static void main(String[] args) {
        double a;
        long i;
        a=Math.abs(-10.5);
        System.out.println("-10.5の絶対値は："+a);
        a=Math.cos(Math.toRadians(30.0));
        System.out.println("30度のcosは："+a);
        a=Math.toDegrees(Math.asin(0.5));
        System.out.println("arcsin(0.5)は："+a+"度");
        i=Math.round(4.678);
        System.out.println("4.678を四捨五入すると："+i);
        a=Math.log10(2.0);
        System.out.println("2の常用対数は："+a);
        a=Math.log(2.0);
        System.out.println("2の自然対数は："+a);
        a=Math.pow(4.0,5.0);
        System.out.println("4を5乗した値は："+a);
    }    
}
