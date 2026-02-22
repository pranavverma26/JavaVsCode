package arrays;
import java.util.Scanner;
public class inputOutputArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n= scn.nextInt();
        int[] arr = new int[n];
        // input -> loop 
        for(int i =0;i<=n-1;i++){
            arr[i] = scn.nextInt();
        }
        // output -> loop
        for(int i =0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
        scn.close();
    }
    
}

