package patternPrinting;
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no of rows and columns : ");
        int n =scn.nextInt();
        int m = scn.nextInt();
    
    // *****
    // *****
    // *****
    // *****
   for(int i =1;i<=n;i++){ // rows
        for(int p = 1;p<=m;p++){ // columns
            System.out.print("*");
        }
        System.out.print("\n");
   } 
   scn.close();
}
}