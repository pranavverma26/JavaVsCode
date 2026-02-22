package BinarySearch;

import java.util.Scanner;

public class searchRotatedArray7 {

                                      // This method is not good.
    public static int bs(int[] arr,int lo,int hi, int target){
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target) hi = mid -1;
            else if(arr[mid]<target) lo = mid +1;
        }
        return -1;
    }
    public static void main(String[] args) {
        
    
    // leet code :- 33

    // Q) Search in rotated Sorted Array.[very important]

    // int[] arr = {0,1,2,3,4,5,6,7};  rotated at pivot index 3
    // arr =  {3,4,5,6,7,0,1,2} this array is rotated from index 3 or pivot from index 3.
    int[] arr =  {1,2,3,4,5,11,0,5,8,9};
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter target :");
    int target = scn.nextInt();
    // pivot is largest element of array.
    int lo=1,hi = arr.length-2;
    int p = -1;
    int idx = 0;
    boolean flag = false;
    while(lo<=hi){
        int mid = lo + (hi-lo)/2;
        if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
            p= mid;
            flag = true;
            break;
        }
        else if(arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1]){
            p = mid-1;
            break;
        }
        else if(arr[mid]>arr[arr.length-1]) lo = mid +1;
        else if(arr[mid]<arr[arr.length-1]) hi = mid -1;

    }
    if(p==-1){
        idx = bs(arr,0,arr.length-1,target);

    }
    if(flag==true){
        idx = bs(arr,1,p,target);
    }
    if(flag == false){
        idx = bs(arr,p+1,arr.length-1,target);
    }
    System.out.println(idx);
    scn.close();

}
    
}
