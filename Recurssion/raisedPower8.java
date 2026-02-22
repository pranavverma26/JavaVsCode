package Recurssion;

public class raisedPower8 {
    public static int power(int a,int b){  // Time complexity :- O(b) because b times call hua hai.
        if(b==0) return 1;
        else return a*power(a,b-1);
    
    }
    public static int power2(int a ,int b){ // This method is best beacuse it's Time complexity = O(logb)
        if(b==0) return 1;
        int ans = power(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }
    public static void main(String[] args) {
        // Make a function which calculates 'a' raised to the power 'b' using recursion.
        System.out.println(power(2,8));
        System.out.println(power2(2,8));

       


    }
    
}
