class TwoDArray{
    public static void main(String[] args){
        int[][] ary1={{1}, {2,3}, {3,4,5}};
        //ary1の出力
        System.out.println("ary1の出力結果");
        for (int i=0; i<ary1.length; i++){
            for (int j=0; j<ary1[i].length; j++)
                System.out.print("  " +ary1[i][j]);
            System.out.println();
        }
        //ary2の作成
        int[][] ary2=new int[3][];
        for (int i=0; i<3; i++){
            ary2[i] = new int[i+1];
            for (int j=0; j<i+1; j++)
                ary2[i][j]=i+j+1;
        }
        //ary2の出力
        System.out.println("ary2の出力結果");
        for (int i=0; i<ary2.length; i++){
            for (int j=0; j<ary2[i].length; j++)
                System.out.print("  "+ary2[i][j]);
            System.out.println();
        }
    }
}