package Recurssion;

import java.util.Scanner;

public class binaryString18 {
    public static void binary(int n,String s){

        if(n==s.length()){
            System.out.println(s);
            return;
        }
        
        
        if(s.length()>=1 && s.substring(s.length()-1).equals("1")){
            // System.out.println( s.substring(s.length()-1));
            binary(n,s+"0");

        }
        else {
            binary(n,s+"0");
            binary(n,s+"1");}
        
    }
    public static void main(String[] args) {

        // Q). Generate all binary strings of length n without consecutive 1's.

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scn.nextInt();
    
        binary(n,"");
        // String p = "01";
        
        // System.out.println(p.substring(p.length()-1));
        // System.out.println(p.substring(p.length()-1)=="1");

        scn.close();


        
    }
    
}
