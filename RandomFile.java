//ランダムアクセスファイル
import java.io.*;
class RandomFile {
    public static void main(String[] args) {
        long[] posary=new long[10];
        int[] idata={10,9,8,7,6,5,4,3,2,1};
        try(RandomAccessFile rf=new RandomAccessFile("radata.dat","rw")) {
            //まずデータを書きだす
            for(int i=0; i<10; i++) {
                posary[i]=rf.getFilePointer();  //int型のため4バイトずつ後ろに異動
                rf.writeInt(idata[i]);

            } 
            //逆順にデータを探しながら読み込む
            for(int i=9; i>=0; i--) {
                rf.seek(posary[i]);             //読み込み位置の指定（バイト列の先頭に移動）
                int val=rf.readInt();
                System.out.printf("i=%2d, val=%3d\n",i,val);
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
