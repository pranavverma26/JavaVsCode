package BinarySearch;

public class binarySearch10 {
    public static void main(String[] args) {
        
    
    // Q). Capacity to ship packages within D days.
    // Leetcode :- 1011
    int[] arr = {1, 2, 3, 1, 1};
    int lo =0;
    int n = arr.length;
    int hi =0;
    int minC =0;
    for(int i =0;i<arr.length;i++){
        lo = Math.max(lo,arr[i]);
        hi+=arr[i];
    }
    while(lo<=hi){
        int mid = lo + (hi-lo)/2;
        int load = 0;
        int days = 1;
        
        for(int i = 0;i<n;i++){
            if(load + arr[i]<=mid) load +=arr[i];
            else{
                load = arr[i];
                days++;
            }
        }
        if(days<=4){
            minC = mid;
            hi = mid -1;
        }
        else lo = mid +1;
        
    }
    System.out.println(minC);


    }
    
}
