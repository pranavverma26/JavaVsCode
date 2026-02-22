package BuilderString;

import java.util.Scanner;

public class stringBuilder_input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string:");
        StringBuilder sb  = new StringBuilder(scn.nextLine());
        System.out.println(sb);

        // setCharAt() = we can add character at any place by using this method in easy way.
        sb.setCharAt(1, 'a');
        System.out.println(sb);





        scn.close();
        
    }
    
}
