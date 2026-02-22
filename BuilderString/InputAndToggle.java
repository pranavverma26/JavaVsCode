package BuilderString;

import java.util.Scanner;

public class InputAndToggle {
    public static void main(String[] args) {
        
    
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter string:");
    StringBuilder sb = new StringBuilder(scn.nextLine());
    for(int i = 0;i<sb.length();i++){
        char q = sb.charAt(i);
        int p = q;
        if(p>=65 && p<=90){
            p+=32;
        }
        else {if(p>=97 && p<=122){
            p-=32;

        }}
        sb.setCharAt(i,(char)p);


        }
        System.out.println(sb);
        scn.close();
    }

    
    

}
    

