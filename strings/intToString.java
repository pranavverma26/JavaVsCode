package strings;

import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter inetger: ");
        int s = scn.nextInt();
        String p = ""+s;
        // convert into string
       // p+=s;
        System.out.println(p);
        scn.close();;


    }
    
}
