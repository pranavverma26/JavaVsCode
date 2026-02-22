package Recurssion;
import java.util.Scanner;
public class Parenthesis19 {
    public static void paranthesis(int open,int close,int n,String s){
        if(2*n == s.length()){
            System.out.println(s);
            return;
        }

        if(open<n){
            paranthesis(open+1, close, n, s+"(");
        }
        if(close<open){
            paranthesis(open, close+1, n, s+")");
        }



    }
    public static void main(String[] args) {
        
        // Q). Generate parenthesis.
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scn.nextInt();


        paranthesis(0,0,n,"");
        scn.close();


    }
    
}
