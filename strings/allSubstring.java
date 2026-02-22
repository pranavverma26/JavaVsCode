package strings;

import java.util.Scanner;

public class allSubstring {
    public static void main(String[] args) {
        
    
    // Q). input a string and print all the subsstrings of  that
    // string.
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter string: ");    
    String s = scn.nextLine();
    for(int i = 0;i<s.length();i++){
        for(int j=i+1;j<=s.length();j++){
        System.out.print(s.substring(i, j)+" ");}
        System.out.println();
    }
    scn.close();
}
    
}
