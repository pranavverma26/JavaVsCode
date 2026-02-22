package arrays;
import java.util.Arrays;
public class sort {
    public static void main(String[] args) {
        int[] arr = {30,11,85,66,2,0,98};
        // for each loop:-
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
