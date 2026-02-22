package Recurssion;

import java.util.Scanner;

public class GCD17 {
    public static int hcf(int a , int b){   // Time complexity = O(min(a,b))  because ya loop min(a,b) times chlegi.
        for(int i = Math.min(a, b);i>=1;i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }
    public static int gcd(int p,int q){
        if(p%q==0) return q;
       return  gcd(q,p%q);

    }
    
    public static void main(String[] args) {
        
        // LCM>= max(a,b) and HCF <= min(a,b)

        // Q) Calculate Greatest Common Divisor of two numbers.
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = scn.nextInt();
        System.out.print("Enter b : ");
        int b = scn.nextInt();
        System.out.println(hcf(a,b));
        if(a>b){
            System.out.println(gcd(a,b));
        }
        else System.out.print(gcd(b,a));
        scn.close();
    }
}
