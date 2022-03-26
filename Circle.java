public class Circle {
    int x, y;       //field : describe properties of object
    double r;       //field
    Circle(int i,int j,double d) {  //constructer : create object(the same name as class)
        x=i; y=j; r=d;
    }
    double perimeter() {            //method
        return 2.*3.141592*r;       //the type of value is double 
    }
    double area() {
        return 3.141592*r*r;
    }
    void move(int dx,int dy) {      //move the main point in a circle
        x+=dx; y+=dy;
    }
    void disp() {
        System.out.println("("+x+","+y+","+r+")" );
    }
}
