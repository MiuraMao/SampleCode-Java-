//�����N���X��static�ȃ����o�[�����ĂȂ�
//�����N���X�錾��static��t���邱�Ƃ͉\
class List {
    class Cell {        //�����N���X�i�A�N�Z�X�C���q��t���邱�Ƃ��\�j
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
