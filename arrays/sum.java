package arrays;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        int p = 0;
        for(int i= 0;i<n;i++){
            System.out.print("element "+(i+1)+" = ");
            arr[i] = scn.nextInt();
            }
        for(int i=0;i<n;i++){
            p+=arr[i];
        }   
        System.out.print("Sum of all elements in the given array = "+p); 
        scn.close();
    }
    
}
