package patternPrinting;
import java.util.Scanner;
public class starDiamond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n+1-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j =1;j<=i+1;j++){
                System.out.print(" ");
            }
            for(int j = 2*(n-i)-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        scn.close();
    }
    
}
