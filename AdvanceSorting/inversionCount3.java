package AdvanceSorting;

public class inversionCount3 {
    static int count = 0;
    public static void inversion(int[] a,int[] b){
        int i=0,p=0;
        while(i<a.length && p<b.length){
            if(a[i]>b[p]) {
                count+=(a.length-i);
                p++;
            }
            else i++;
        }
        
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
        
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for(int i=0;i<n/2;i++) a[i] = arr[i];
        for(int i=0;i<n-n/2;i++) b[i]=arr[i+n/2];

        mergeSort(a);
        mergeSort(b);
        inversion(a, b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        
        // Q). You have to count the number of inversion.
        int[] arr = {8,2,5,3,1,4};
        print(arr);
        mergeSort(arr);
        System.out.println(count);    
        // leet code :- 493
    }
    
}
