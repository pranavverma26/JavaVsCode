package patternPrinting;
import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        // A A A A
        // B B B B
        // C C C C 
        // D D D D
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter rows and columns : ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        char p = 'A';
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                System.out.print(p+" ");
            }
            p++;
            System.out.println();
        }
        scn.close();
    }
    
}
