package arrays;
import java.util.Scanner;
public class outputOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[7];
        // input -> loop 
        for(int i =0;i<=6;i++){
            arr[i] = scn.nextInt();
        }
        // output -> loop
        for(int i =0;i<=6;i++){
            System.out.print(arr[i]+" ");
        }
        scn.close();
    }
    
}
