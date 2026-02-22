package Recurssion;

import java.util.Scanner;

public class nNaturalGlobal3 {

    static int n;
    public static void print(int s){
        if(s>n) return;
        System.out.println(s);
        print(s+1);
    }
    public static void main(String[] args) {
        // Print N natural number from 1 to 10 using global variable.
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = scn.nextInt();
        print(1);
        scn.close();

        
    }
    
}
