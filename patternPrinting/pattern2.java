package patternPrinting;
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter rows and columns : ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=m;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scn.close();
    }
    
}
