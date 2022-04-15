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
            System.out.println("ins ‚Æ cpy ‚Í“™‚µ‚¢");
        else
            System.out.println("ins ‚Æ cpy ‚ÍˆÙ‚È‚é");
        if(ins == oth)
            System.out.println("ins ‚Æ oth ‚Í“™‚µ‚¢");
        else
            System.out.println("ins ‚Æ oth ‚ÍˆÙ‚È‚é");
        if(ins.equals(oth))
            System.out.println("ins ‚Æ oth ‚Í“à—e‚ª“¯‚¶");
        else
            System.out.println("ins ‚Æ oth ‚Í“à—e‚ªˆÙ‚È‚é");
    }
    
}
