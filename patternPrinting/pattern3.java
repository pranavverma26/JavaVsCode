package patternPrinting;
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        // A B C D 
        // A B C D
        // A B C D
        // A B C D
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter rows and columns : ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        for(int i = 1;i<=n;i++){
            char p = 'A';
            for(int j = 1;j<=m;j++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
        scn.close();
    }
    
}
