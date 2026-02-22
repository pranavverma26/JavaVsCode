package BinarySearch;

public class peakIndexMountain5 {
    public static void main(String[] args) {
        // leet code :- 852
        // Q). Peak index in a Mountain Array.

        // Mountain array is not a sorted array.Example of mountain array :-
        // arr = {10,20,30,32,35,40,45,50,40,20,4} in this peak tkk element is in increasing order and after that it is decreasing.
        int[] arr = {10,50,30};
        int lo =1,hi = arr.length-2;
        int peak=0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid-1]<=arr[mid] && arr[mid]>=arr[mid+1]){
                peak = mid;
                break;
            }
            else if(arr[mid]<=arr[mid-1]) hi = mid -1;
            else if(arr[mid]<=arr[mid+1]) lo = mid +1;

        }
        System.out.println(peak);


    }
    
}
