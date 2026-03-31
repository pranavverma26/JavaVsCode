import java.util.PriorityQueue;
import java.util.ArrayList;
public class kSorted {
    public static void main(String[] args) {

        // Q) Sort a 'k' sorted array(sort a nearly sorted array).

         int[] arr= {6,5,3,2,8,10,9};int k=3;
         // int[]arr = {3,1,4,2,5};int k=2;
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         ArrayList<Integer> ans = new ArrayList<>();
         for(int i=0;i<arr.length;i++){
                pq.add(arr[i]);
                if(pq.size()>k) ans.add(pq.remove());

         }
         while(pq.size()>0){
            ans.add(pq.remove());
         }
         for(int ele : ans){
            System.out.print(ele+" ");
         }

        
    }
    
}
