package BinarySearch;

public class basicsBinarySearch {
    public static void main(String[] args) {
        /* What and Why ?
        It is used to search an given element in a sorted space.
        It is used to reduce the search space in half after every term.

        Why ?

        It is very efficient.
        Usually we apply binary search when it is given that It is a sorted array.

        arr = {10,15,21,34,81,105,180,50}
        target = 105
        Linear search => T.C = O(n)

        arr = {10,15,21,34,81,105,18,500}
        target = 81
                if(arr[mid]<target) go right
                else if(arr[mid]>target) g left
                else if(arr[mid]==target) break;

        check for target = 110*/

        int[] arr = {10,15,21,34,81,105,180,500,614};
        int target = 23;
        int lo=0,hi = arr.length-1;
        boolean flag = false;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>target) hi = mid -1;
            if(arr[mid]<target) lo = mid +1;
            if(arr[mid]==target) {flag = true; break;}  
        }
        if(flag==true) System.out.println("found");
        else System.out.println("not found");

    }
    
}
