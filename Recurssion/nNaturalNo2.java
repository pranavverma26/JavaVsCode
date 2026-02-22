package Recurssion;

public class nNaturalNo2 {
    public static void number(int n){
        if(n==0) return;
        
        System.out.println(n-(n-1));
        number(n-1);
    }
    // public static void print(int n,int s){                    
    //     if(n==0) return;
    //     if(n>0){
    //         System.out.println(s);
    //         s++;
    //         print(n-1,s);
    //     }
    // }  This commented code is written by me and uncommented code is written by sir.

    public static void print(int s,int n){
        if(s>n) return ;
        System.out.println(s);
        print(s+1,n);
    }
    public static void natural(int n){
        if(n==0) return;
        int s = n;
        System.out.println(s);
        natural(n-1);
    }
    public static void main(String[] args) {
        natural(7);
        System.out.println();
        print(1,7);
        System.out.println();
        number(7);
    }
    
}
