package AdvanceSorting;

public class mergeSortingAlgo1{
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] arr,int[] trr,int[] srr){
        int i =0,j=0,k=0;
        while(i<arr.length && j<trr.length){
            if(arr[i]<=trr[j]){
                srr[k] = arr[i];
                i++;
            }
            else {
                srr[k]= trr[j];
                j++;
            }
            k++;

        }
        if(i==arr.length){
            while(j<trr.length){
            srr[k] = trr[j];
            j++;
            k++;
        }}
        if(j==trr.length){
            while(i<arr.length){
                srr[k]= arr[i];
                i++;
                k++;
            }
        }
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for(int i=0;i<n/2;i++) a[i] = arr[i];
        for(int i=0;i<n-n/2;i++) b[i] = arr[i+n/2];
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr = {80,60,90,50,10,40,88};
        print(arr);
        mergeSort(arr);
        print(arr);
    }    
}
