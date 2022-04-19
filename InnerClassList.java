//内部クラスはstaticなメンバーを持てない
//内部クラス宣言にstaticを付けることは可能
class List {
    class Cell {        //内部クラス（アクセス修飾子を付けることが可能）
        int data;
        Cell next;
    }
    Cell head;
    void add(int x) {
        Cell p=new Cell();
        p.data=x; p.next=head; head=p;
        return;
    }
    void print() {
        Cell p=head;
        while(p != null) {
            System.out.println(p.data);
            p=p.next;
        }
    }
}
class InnerClassList {
    public static void main(String[] args) {
        List list=new List();
        list.head=null;
        list.add(1); list.add(2); list.add(3);
        list.print();
    }    
}
