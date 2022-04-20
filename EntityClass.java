class Entity {      //EntityClassで様々なインスタンスを１つのスーパークラス型の配列で管理できる
    public void show() {
        System.out.println("データがない");     //メソッドの内容は意味を持つものではない
    }
}
class Circle extends Entity {
    int x, y, r;
    public Circle(int x,int y,int r) {
        this.x=x; this.y=y; this.r=r;
    }
    @Override
    public void show() {
        System.out.println("x="+x+",y="+y+",r="+r);
    }
}
class Square extends Entity {
    int x,y,d;
    public Square(int x,int y,int d) {
    this.x=x; this.y=y; this.d=d;
    }
    @Override
    public void show() {
        System.out.println("x="+x+",y="+y+",d="+d);
    }
}
class EntityClass {
    public static void main(String [] args) {
        Entity[] ary=new Entity[4];
        ary[0]=new Circle(15,10,4);
        ary[1]=new Circle(20,40,8);
        ary[2]=new Square(10,10,5);
        ary[3]=new Square(20,20,10);
        for(int i=0; i<4; i++) {
            if(ary[i] instanceof Circle) System.out.print("Circle: ");
            else if(ary[i] instanceof Square) System.out.print("Square: ");
            ary[i].show();
        }
    }

}
