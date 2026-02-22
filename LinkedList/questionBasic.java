package LinkedList;
public class questionBasic {
     public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,11,13,14,16};
        int sum =19;
        int lo =0;
        int hi =arr.length-1;
        while(lo<=hi){
            if(arr[lo]+arr[hi]==sum){
                System.out.println(arr[lo]);
                System.out.println(arr[hi]);
                lo++;
                hi--;
                
            }
            else if(arr[lo]+arr[hi]>sum) hi = hi-1;
            else lo = lo+1;
        }
    }
    
}
