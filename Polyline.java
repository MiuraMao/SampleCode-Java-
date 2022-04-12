//ポリライン（折れ線）近似
class Polyline {
    int pnum;       //折れ線数
    int[] x, y;
    Polyline(int pnum, int[] x, int[] y) {      //コンストラクタ
        this.pnum=pnum; this.x=new int[pnum]; this.y=new int[pnum]; //thisをつけることでフィールド変数を指定できる
        for(int i=0; i<n; i++) {
            this.x[i]=x[i]; this.y[i]=y[i];
        }
    }
    void print() {
        System.out.println("Vertex="+pnum);
        for(int i=0; i<pnum; i++) 
            System.out.println("["+i+"] ("+x[i]+","+y[i]+")");
    }
    double length() {
        double sum=0.0;
        for(int i=0; i<pnum-1; i++)
            sum +=Math.sqrt((double)((x[i+1]-x[i])*(x[i+1]-x[i])+(y[i+1]-y[i])*(y[i+1]-y[i]))); //折れ線1本ごとの長さの総和
        return sum;
    }
}
