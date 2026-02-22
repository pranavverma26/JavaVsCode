package arrays;
import java.util.Scanner;
public class rotateArray {
    //using temproray array.1
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int[] rslt = new int[arr.length];
        Scanner scn = new Scanner(System.in);
        int k  = scn.nextInt();
        k = k%(arr.length);
        for(int i =0;i<k;i++){
            rslt[i]=arr[arr.length-k+i];
        }
        for(int i=0;i<arr.length-k;i++){
            rslt[i+k]=arr[i];
    
        }
        for(int i =0;i<arr.length;i++){
            arr[i]=rslt[i];
        }
        
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        scn.close();
    }
    
}
