package arrays;
import java.util.Arrays;
public class copyOfArrays {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums = arr; // shallow copy
        nums[0] = 90;
        System.out.println("arr[0] after shallow copy = "+arr[0]); // here in original 
        // arrow also the value will change.So we use another
        // method for copy. 

        // deep copy.
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 70;
        System.out.println("arr[0] after deep copy = "+arr[0]);
        
        // Another method for deep copy.

        int[] crr  =new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            crr[i] = arr[i];
        }
        crr[0] = 100;
        System.out.println("arr[0] after deep copy = "+arr[0]);

    }
    
}
