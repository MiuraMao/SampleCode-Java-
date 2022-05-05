import java.util.*;
class PriorityQueueSample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();    //優先順位付きキュー
        pq.offer(15);   //addメソッドと同じ
        pq.offer(5);
        pq.offer(10);
        pq.offer(2);
        while(pq.size() > 0) {
            System.out.println("Data="+pq.poll());  //pollで要素を取り出し、キューから削除される
        }
    }    
}
