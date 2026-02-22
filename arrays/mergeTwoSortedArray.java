package arrays;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
    int[] arr = {4,8,62,71,98};
    int[] nums = {1,11,65,84,89,86};
    int[] narr = new int[arr.length+nums.length];
    int i=0,j=0,k=0;
    while(i<arr.length && j<nums.length){
        if(arr[i]<=nums[j]){
            narr[k]=arr[i];
            i++;
        }
        else{
            narr[k]=nums[j];
            j++;
        }
        k++;
    }
    if(i==arr.length){ // now take elements from nums only.
        while(j<nums.length){
            narr[k]=nums[j];
            j++;k++;
        }
    }
    if(j==nums.length){ // now takes elements from arr only.
        while(i<arr.length){
            narr[k]=arr[i];
            i++;k++;
        }
    }
    for(int ele : narr){
        System.out.print(ele+" ");
    }
    
      
        }
    }



    
    
