//バイトデータのファイル出力
//try-with-resources文を使わない場合はfinally節でclose()を呼び出す必要がある
//close()でも例外が発生する可能性があるためtry-catch文を書く必要がある
import java.io.*;
class ByteStreamOutput {
    public static void main(String[] args) {
        int[] d={1,2,3,4,5};
        try(DataOutputStream bout=new DataOutputStream( //try-with-resources文（エラーの有無にかかわらず終了時にファイルクローズ）
                                  new BufferedOutputStream(
                                  new FileOutputStream("binfile.dat")))){   
            for(int i=0; i<d.length; i++)
                bout.writeInt(d[i]);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
