package BuilderString;

import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        // Take input a stringbuilder & reverse it 
        // without using builtin function.
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String :");// pranav
        StringBuilder s = new StringBuilder(scn.nextLine());
        int r = s.length();
        for(int i =0;i<s.length()/2;i++){
            char p = s.charAt(i);
            s.setCharAt(i, s.charAt(r-1));
            s.setCharAt(r-1, p);
            r--;
        }
        System.out.println(s);
        scn.close();
       

    }
    
}
