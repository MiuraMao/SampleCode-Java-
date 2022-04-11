class StringTest {
    public static void main(String [] args) {
        String s1=new String("abcdefg");
        String s2=new String("abcdefg");
        String s3=new String("あいうえお");
        System.out.println("文字列："+s1);
        System.out.println("３番目の文字："+s1.charAt(3));
        System.out.println(s1+"と"+s2+"の比較："+s1.compareTo(s2)); //辞書的に前にある場合は負数、後にある場合は正数（漢字はコード順）
        System.out.println(s1+"と"+s3+"の比較："+s1.compareTo(s3));
        System.out.println(s1+"と"+s3+"の結合："+s1.concat(s3));
        System.out.println(s1+"に"+"defは含まれるか："+s1.contains("def"));
        System.out.println(s1+"と"+s2+"は内容が同じか："+s1.contentEquals(s2));
        System.out.println(s1+"と"+s2+"は同じオブジェクト："+s1.equals(s2));
        String s4=String.format(s3+"の文字数は"+s3.length());
        System.out.println(s4);
        System.out.println(s3+"中で「う」は"+s3.indexOf('う')+"文字目");
        System.out.println(s3+"の「う」を「く」に置き換える："+s3.replace('う','く'));
        System.out.println(s1+"を大文字に変換："+s1.toUpperCase());
    }    
}
