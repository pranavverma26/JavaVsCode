package BinarySearch;

import java.util.Scanner;

public class sqrt6 {
    public static void main(String[] args) {

        // leet code :- 69
        //  we put the int data type then we can,t find the sqrt of big numbers bcz as we know that the int can hols only up to 2^31-1. And we have mid*mid 
        // which make the number more bigger so we have two method to remove this problem.
        // 1. use long data type or mid = x/mid.[which is same as mid*mid = x] but in this case we did not put mid =0 so to handle this 
        //  we have to put one condition.
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no =");
        long x = scn.nextLong();
        long sqrt=0;
        long lo=0,hi=x;
        boolean flag = false;
        while(lo<=hi){
            long mid = lo + (hi-lo)/2;
            if(mid*mid == x/*mid = mid/x */){
                sqrt = mid;
                flag = true;
                break;
            }
            else if((mid*mid)>x) hi = mid-1;
            else if((mid*mid)<x) lo = mid+1;
        }
        if(flag == false) sqrt = hi; // if the sqrt of number is not present.
        System.out.println("Sqrt of "+x+" = "+sqrt);
        scn.close();
        
    }
    
}
