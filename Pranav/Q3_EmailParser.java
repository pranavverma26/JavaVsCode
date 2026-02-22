package Pranav;
import java.util.*;

public class Q3_EmailParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        String username = email.substring(0, email.indexOf('@'));
        System.out.println("Username: " + username);
        String[] tokens = email.split("@");
        System.out.println("Tokens:");
        for (String t : tokens) {
            System.out.println(t);
        }
        sc.close();
    }
}
