import java.util.*;
class PriorityQueueSample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();    //�D�揇�ʕt���L���[
        pq.offer(15);   //add���\�b�h�Ɠ���
        pq.offer(5);
        pq.offer(10);
        pq.offer(2);
        while(pq.size() > 0) {
            System.out.println("Data="+pq.poll());  //poll�ŗv�f�����o���A�L���[����폜�����
        }
    }    
}
