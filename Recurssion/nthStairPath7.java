package Recurssion;

import java.util.Scanner;

public class nthStairPath7 {
    public static int stair(int n){

        //Q) Find number of ways to reach nth stair if one or two jump at a time is allowed.

        if(n<=2) return n;
        return stair(n-1) + stair(n-2);
    }
    public static int stair3(int n){

         //Q) Find number of ways to reach nth stair if one or three jump at a time is allowed.

        if(n<3) return 1;
        if(n==3) return 2;
        return stair3(n-1) + stair3(n-3);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scn.nextInt();

       // number of ways to reach nth stair if one or two jump at a time is allowed.
         System.out.println(stair(n));

       // number of ways to reach nth stair if one or three jump at a time is allowed.
        System.out.println(stair3(n));
        scn.close();

        
    }
    
}
