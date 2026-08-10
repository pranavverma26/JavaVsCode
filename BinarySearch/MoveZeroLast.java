package BinarySearch;

public class MoveZeroLast {
    public static void main(String[] args){
        int[] arr={1,2,0,4,3,0,5,0};
        int left=0;
        while(left<arr.length && arr[left] !=0){
            left++;
        }
        int right=left+1;
        while(right<arr.length){
            if(arr[right]!=0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
            right++;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
    
}
