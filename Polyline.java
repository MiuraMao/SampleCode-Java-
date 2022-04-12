//�|�����C���i�܂���j�ߎ�
class Polyline {
    int pnum;       //�܂����
    int[] x, y;
    Polyline(int pnum, int[] x, int[] y) {      //�R���X�g���N�^
        this.pnum=pnum; this.x=new int[pnum]; this.y=new int[pnum]; //this�����邱�ƂŃt�B�[���h�ϐ����w��ł���
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
            sum +=Math.sqrt((double)((x[i+1]-x[i])*(x[i+1]-x[i])+(y[i+1]-y[i])*(y[i+1]-y[i]))); //�܂��1�{���Ƃ̒����̑��a
        return sum;
    }
}
