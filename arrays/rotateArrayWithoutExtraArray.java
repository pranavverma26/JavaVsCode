package arrays;
import java.util.Scanner;
public class rotateArrayWithoutExtraArray {
    public static void swap(int [] nums,int i,int j){
        while(i<=j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k =scn.nextInt();
        int[] arr = {5,78,11,6,4,2};
        int n = arr.length;
        k = k%n;
        swap(arr,0,n-k-1);
        swap(arr,n-k,n-1);
        swap(arr,0,n-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        scn.close();

    }
    
}
