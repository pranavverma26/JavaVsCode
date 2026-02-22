package BinarySearch;

public class smallestDivisorThreshold {
    public static void main(String[] args) {
        //Q). Find the smallest Divisor given a Threshold.
        //Leetcode - 1283
        // int[] arr = {5,1,9,2};
        // int n = arr.length;
        // int mx = Integer.MIN_VALUE;
        // int t = 6;
        // for(int i =0;i<arr.length;i++){
        //     mx = Math.max(mx, arr[i]);
        // }
        // for(int d = 1;d<=mx;d++){
        //     int s = 0;
        //     for(int i =0;i<arr.length;i++){
        //         if(arr[i]%d == 0){
        //             s += arr[i]/d ;
        //         }
        //         else s+=(arr[i]/d + 1);
        //     }
        //     if(s<=t){
        //         System.out.println(d);
        //         break;
        //     }

        // }

                         // The above is not best and good way to solve and it's Time complexity =
                                         // T.C = O(n*mx) multiply because the both loop are independent of each loop but they are nested loop.

        int[] arr = {44,22,33,11,1};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        int t = 6;
        for(int i =0;i<arr.length;i++){
            mx = Math.max(mx, arr[i]);
        }
        int d = 0;
        int lo = 1,hi = mx;
        while(lo<=hi){                                 // as we know that if here lo = 0 and hi = n-1 then T.C = logn
            int mid = lo+(hi-lo)/2;                    // But in this acse lo = 1  and hi = mx so T.c = logmx
            int s = 0;
            for(int i =0;i<n;i++){
                if(arr[i]%mid == 0){
                    s += arr[i]/mid ;
                }
                else s+=(arr[i]/mid + 1);
            }
            if(s<=t){
                d = mid;
                hi = mid -1;
                
            }
            else lo = mid +1;
        }
        System.out.println(d);

                                           // T.C = O(n*logmx)


        

    }
    
}