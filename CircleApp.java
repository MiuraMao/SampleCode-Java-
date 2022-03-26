public class CircleApp {    //class file must be completed within one file
    public static void main(String[] args) {
        Circle c=new Circle(100,200,5.0);
        c.disp();       //calling method (message passing)
        double p=c.perimeter();
        double a=c.area();
        System.out.println("perimeter="+p);
        System.out.println("area    ="+a);
        c.move(50,-50);
        c.disp();
    }
}
