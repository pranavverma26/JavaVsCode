package Recurssion;
import java.util.Scanner;
public class nSumparameter5 {
    public static int sum(int n){
        if(n==1) return 1;
        int ans = n + sum(n-1);
        return ans; 


    }
    public static void main(String[] args) {
        // Print sum from 1 to n. (Parameterised)
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scn.nextInt();
        System.out.println(sum(n));
        scn.close();
    }
    
}
