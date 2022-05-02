import java.io.*;
class ByteStreamInput {
    public static void main(String[] args) {
        int[] d={1,2,3,4,5};
        try(DataInputStream bin=new DataInputStream(
                                new BufferedInputStream(
                                new FileInputStream("binfile.dat")))){
            for(int i=0; i<d.length; i++)
                System.out.println(bin.readInt());  //int型のデータをファイルから１つずつ読み込む
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
