import java.util.Collections;
import java.util.PriorityQueue;

public class intro1 {
    public static void main(String[] args) {
        // There are two types of heap :-
        // 1) Minimum Heap 2) Max Heap

                               // Min Heap

        // If we add/remove the element in pq then ele which is smallest came at peak/top everytime
        
        // Why heap ??
        // n= no of elements present in heap
        // when we add its t.c is O(logn)
        //remove t.c=O(logn)
        // peek t.c=O(1)

        // If we are adding n elements one by one in a heap then
        // no of operations = log(1)+log(2)+log(3)+...log(n)=log(n!) ~ nlog(n)
        // we   use heap because ya tbhi k tbhi kaam kr k dea rha hai jaisa add 
        // k time he minimum top pa aa jata hai
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        System.out.println(pq+" "+pq.peek());
        pq.add(2);
         System.out.println(pq+" "+pq.peek());
        pq.add(2);
          System.out.println(pq+" "+pq.peek());
          pq.remove();
          System.out.println(pq+" "+pq.peek());
        pq.add(10);
        System.out.println(pq+" "+pq.peek());
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        pq.remove();
        System.out.println(pq+" "+pq.peek());
        pq.add(0);
        System.out.println(pq+" "+pq.peek());

        System.out.println();
                                  // Max Heap
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
         pq1.add(4);
        System.out.println(pq1+" "+pq1.peek());
        pq1.add(3);
        System.out.println(pq1+" "+pq1.peek());
        pq1.add(11);
        System.out.println(pq1+" "+pq1.peek());
        pq1.remove();
        System.out.println(pq1+" "+pq1.peek());
        pq1.add(8);
        System.out.println(pq1+" "+pq1.peek());
        
    }
    
}
