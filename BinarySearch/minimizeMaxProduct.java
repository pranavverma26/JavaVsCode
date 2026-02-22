package BinarySearch;

public class minimizeMaxProduct {
    public static void main(String[] args) {
        // Minimized maximum of Products distributed to any store.
        // Leet code = 2064
        int[] arr = {15,10,10};
        int lo = 1;
        int hi = Integer.MIN_VALUE;
        int minAns = 0;
        for(int i =0;i<arr.length;i++){
            hi = Math.max(arr[i],hi);
        }
        while(lo<=hi){
           int mid = lo+(hi-lo)/2;
           int shop = 1;
           int s =0;
           for(int i =0;i<arr.length;i++){
            if(s+arr[i]<mid){
               s+=arr[i];
                }
            else{
                s = arr[i];
                shop++;
                
            }
           }
           if(shop<=7){
            minAns = mid;
            hi = mid -1;
        }
           else lo = mid +1;

        }
        System.out.println(minAns);

    }
    
}
