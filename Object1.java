class A {
    protected int i;
    protected String s;
    public String toString() {
    return "("+i+") :"+s;        
    }
    public boolean equals(A obj) {
        if(this.i==obj.i && this.s.equals(obj.s)) return true;
        else return false;
    }
}
class Object1 {
    public static void main(String [] args) {
        A ins=new A(); ins.i=10; ins.s="abcdefg";
        A cpy=ins;
        System.out.println(ins.getClass());
        System.out.println(ins.toString());
        System.out.println(ins);
        A oth=new A(); oth.i=10; oth.s="abcdefg";
        if(ins == cpy)
            System.out.println("ins �� cpy �͓�����");
        else
            System.out.println("ins �� cpy �͈قȂ�");
        if(ins == oth)
            System.out.println("ins �� oth �͓�����");
        else
            System.out.println("ins �� oth �͈قȂ�");
        if(ins.equals(oth))
            System.out.println("ins �� oth �͓��e������");
        else
            System.out.println("ins �� oth �͓��e���قȂ�");
    }
    
}
