package strings;

import java.util.Scanner;

public class numberOfDigit {
    public static void main(String[] args) {
        // Return the total number of digits in a number 
        // without using any loop.
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter int:");
        int s = scn.nextInt();
        String p =  Integer.toString(s);
        System.out.println("Total number of digit in "+s+" = "+p.length());
        scn.close();

    }
    
}
