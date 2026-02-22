package AdvanceSorting;

public class randomizedPivotPoint5 {
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
        int mid=(lo+hi)/2;
        int pivotIdx=mid;
        int pivot = arr[mid];
        for(int i=lo;i<=hi;i++){
            if(i==mid) continue;
            if(pivot>=arr[i]) idx++;
        }
        int correctIdx = lo+idx; // (it is imp bcz after partition, lo changes(which is equal to idx). So for that  sub array lo becomes correctIdx )
        swap(arr,pivotIdx,correctIdx);
        int i=lo,j=hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
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
        
        //Instead of choosing arr[lo] as pivot, we can choose arr[(lo+hi)/2] as pivot.
        int[] arr = {4,9,5,88,6,3,11,12,18,1,7};
        print(arr);
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
    
}
