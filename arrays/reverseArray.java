package arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {4,62,11,8,26,27,29};
        int n = arr.length;
        // for(int i = 0;i<arr.length;i++){
        //     int j = arr.length+1-i;
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //    }

        // 2nd Method :-
        int i =1,j=5; // part of array reverse.
        // int i =0,j=arr.length-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
           for(int ele : arr ){
            System.out.print(ele+" ");
           }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // for(int i=0;i<=n-1;i++){
    //     int temp = arr[i];
    //     arr[i]=arr[n-1];
    //     arr[n-1]=temp;
    //     n--;
    // }
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    // }
    
    }
// }
