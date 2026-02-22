package BinarySearch;

public class timeCompAna2 {
    public static void main(String[] args) {
       // leet code 704
       /* mid = (lo + hi)/2 lo and hi are 'int'
         As we know that int values are from -2^31<= lo,hi <= 2^31 - 1
         what if(lo+hi)> 2^31-1 (error: Integer overflow error)
         But if lo = 1 and hi = 231 - 1 then mid = 2^30 <= 2^31 -1 
         mid = (lo+hi)/2 = [(hi-lo)+(lo+lo)]/2 = (hi-lo)/2 +lo

         Now this mid value is valid in every case

        */
        int[] arr = {10,23,46,89,91,97,107,140,264};
        int target = 46;
        int lo =0,hi=arr.length-1;
        // boolean flag = false;
        while(lo<=hi){
            int mid =lo + (hi-lo)/2;
            if(arr[mid]== target){System.out.println(mid);} // flag = true; break;
            else if(arr[mid]>target) hi =  mid-1;
            else if (arr[mid]<target) lo =mid+1;
        }
        // if(flag==true) System.out.println("target present");
        // else System.out.println("target not found");

        // In binary search reduction in search space by half.

        // consider that we have 100000 elements present in a sorted array.

        // In this case in linear search total number of operations = 100000

        // 100000 -> 50000 -> 25000 -> 12500 -> 6250 -> 3125 -> 1600 ->800 -> 400 ->200 ->100 -> 50 ->25 -> 12 ->6 -> 3 -> 1
        // In Binary search total no of operation = 17

        //                               Time complexity 

        // n -> n/2 -> n/4 -> n/8 .......2 -> 1
        //                 or
        // 1 -> 2 -> 4 ....... n/2 -> n  [x terms]

        // 1 -> 2^2 -> 2^3 .... 2^x-1

        // 2^x-1 = n (applyinf log both sides)
        // log(base 2)n= x-O(x) = O(log(base 2)n) = O(logn)

        // O(logn) >> O(n) > O(n^2)  


        // leet code = 704


        

        
    }
    
}
