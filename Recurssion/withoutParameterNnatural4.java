package Recurssion;

public class withoutParameterNnatural4 {
    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        // print n natural number without extra parameter.
        print(6);
        
    }
    
}
