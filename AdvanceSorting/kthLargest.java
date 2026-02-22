package AdvanceSorting;

public class kthLargest {
     static int ans =0;
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
        //int n= arr.length;
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

    public static void quickSort(int[] arr,int lo,int hi,int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo==(arr.length-k)){
            ans=arr[lo];
            return;
        }}
        // pivot arr[lo] lo shi jagah rkho.
        // & left part me <= pivot
        int p = partition(arr,lo,hi);
        if(p==(arr.length-k)) {
            ans=arr[p];
            return;
        }
        if(p>(arr.length-k)){
        quickSort(arr,lo,p-1,k);
    }
        else quickSort(arr, p+1, hi,k);

    }

    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6};
        print(arr);
        ans = -1;
        int k=7;
        quickSort(arr, 0, arr.length-1, k);
        System.out.print(ans);
        
    }
    
}
class Solution {
    static int ans;
    public static void swap(int[] arr,int lo,int hi){
        int temp = arr[lo];
        arr[lo]=arr[hi];
        arr[hi]=temp;

    }
    public static int partition(int[]arr,int lo,int hi){
        int idx=0;
        //int n= arr.length;
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

    public static void quickSort(int[] arr,int lo,int hi,int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo==(k-1)){
            ans=arr[lo];
            return;
        }}
        // pivot arr[lo] lo shi jagah rkho.
        // & left part me <= pivot
        int p = partition(arr,lo,hi);
        if(p==(k-1)) {
            ans=arr[p];
            return;
        }
        if(p>(k-1)){
        quickSort(arr,lo,p-1,k);
    }
        else quickSort(arr, p+1, hi,k);

    }
    public int findKthLargest(int[] arr, int k) {
        ans=-1;
        int n = arr.length;
        quickSort(arr,0,n-1,n-k+1);
        return ans;
        
    }
}
