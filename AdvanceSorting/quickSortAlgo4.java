package AdvanceSorting;
public class quickSortAlgo4 {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int lo,int idx){
        int temp = arr[lo];
        arr[lo]=arr[idx];
        arr[idx]=temp;

    }
    public static int partition(int[]arr,int lo,int hi){
        int idx=0;
        int pivot = arr[lo];
        for(int i=lo+1;i<=hi;i++){
            if(pivot>arr[i]) idx++;
        }
        int correctIdx = lo+idx; // (it is imp bcz after partition, lo changes(which is equal to idx). So for that  sub array lo becomes correctIdx )
        swap(arr,lo,correctIdx);
        int i=lo,j=hi;
        
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<arr[correctIdx]) i++;
            else if(arr[j]>arr[correctIdx]) j--;
            else if(arr[i]>arr[correctIdx] && arr[j]<arr[correctIdx]){
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }

    public static void quickSort(int[] arr,int lo,int hi){
        if(lo>=hi) return;
        // pivot arr[lo] lo shi jagah rkho.
        // & left part me <= pivot
        int p = partition(arr,lo,hi);
        quickSort(arr,lo,p-1);
        quickSort(arr, p+1, hi);

    }
    public static void main(String[] args) {
        int[] arr = {4,9,5,88,6,3,11,12,18,1,7};
        print(arr);
        quickSort(arr, 0, arr.length-1);
        print(arr);

        // Time complexity of quick sort(Average case) = O(n*logn) ~ time complexity of merge sort 

        // Space complexity of merge sort =  Recursive call stack space = O(logn)
    }
    
}
