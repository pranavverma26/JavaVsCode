package Recurssion;

public class traverseArray11 {
    public static void print(int s,int[] arr ){

        if(s==arr.length) return;
        System.out.print(arr[s]+" ");
        print(s+1,arr);
    }
    public static void main(String[] args) {
        int[] arr = {4,11,3,86,9};
        print(0,arr);
    }
    
}
