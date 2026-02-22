package Recurssion;

public class basic1 {
    public static int factorial(int n){
        int s = 1;
        if(n>0){
        s*=n*factorial(n-1);
        n--;
        if(n==0) return 1;
    }
    return s;
    }
    public static void main(String[] args) {
        System.out.println(factorial(1));
        
    }
    
}
