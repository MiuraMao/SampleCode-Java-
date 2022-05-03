import java.util.*;
class Point {
    int x,y;
    Point(int x,int y) {
        this.x=x; this.y=y;
    }
}
class PointCompare implements Comparator<Point> {
    @Override
    public int compare(Point p1,Point p2) {
        if(p1.x < p2.x) return -1;
        if(p1.x > p2.x) return 1;
        if(p1.y < p2.y) return -1;
        if(p1.y < p2.y) return 1;
        return 0;
    }
}

class PointCompareSample {
    public static void main(String[] args) {
        PointCompare comp=new PointCompare();
        TreeSet<Point> ts=new TreeSet<Point>(comp); //コレクションクラスTreeSet
        ts.add(new Point(30,20));
        ts.add(new Point(10,30));
        ts.add(new Point(20,15));
        ts.add(new Point(15,20));
        Point f=(Point)ts.first();
        Point l=(Point)ts.last();
        System.out.println("first="+f.x+","+f.y);
        System.out.println("last="+l.x+","+l.y);
    }    
}
