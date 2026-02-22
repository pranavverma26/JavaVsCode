package BuilderString;

import java.util.Scanner;

public class input_update_position {
    public static void main(String[] args) {
        
        // Q). Input a string and Update all the even positions in 
        // the string to character 'a'. Consider 0-based indexing.
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scn.nextLine();
        String str = "";
        // for(int i=0;i<s.length();i++){
        //     if(i%2==0){
        //         s = s.substring(0,i) + "a"+s.substring(i+1);
        //     }
        // }
        // Another method :-
        for(int i=0;i<s.length();i++){
            if(i%2==0) str+='a';
            else str += s.charAt(i);
        }
        System.out.println(str);
        //System.out.println(s);
        // Performance of Strings :- Poor performance because of
        // immutability.





        scn.close();

    }
    
}
