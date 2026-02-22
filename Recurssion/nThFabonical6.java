package Recurssion;

public class nThFabonical6 {
    public static int fabonaci(int n){
        if(n<=1) return n;
        int ans = fabonaci(n-1) + fabonaci(n-2);
        return ans;
    }
    public static void main(String[] args) {
        // Write a function to calculate the nth fabonacci number using recursion.
        // leet code :- 509
        System.out.print(fabonaci(3));
    }
    
}
