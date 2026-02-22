package strings;
import java.util.Scanner;
public class inputString {
    public static void main(String[] args) {
        // String str = "Hello";
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your name:");
        String s = scn.nextLine(); // if we use only next then woa space k badd wala input mai nhi lega. Ishlya nextLine use krta hai
        System.out.print("Hii ");
        System.out.println(s);
        scn.close();
    }

    
}
