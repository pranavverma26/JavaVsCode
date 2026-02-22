package patternPrinting;
import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        // 1
        // 13
        // 135
        // 1357
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int n = scn.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(2*j-1 +" ");
            }
            System.out.println();
        }
        scn.close();
    }
    
}
