package patternPrinting;
import java.util.Scanner;
public class starBridge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter rows and column: ");
        int n = scn.nextInt();
        int m = n-1;
        for(int j =1;j<=2*n-1;j++){
            System.out.print("*");
        }
        System.out.println();
        for(int i =1;i<=n;i++){
            for(int j =m;j>0;j--){
                System.out.print("*");
            }
            for(int j =1;j<=2*i-1;j++){
                System.out.print(" ");
            }
            for(int j=m;j>0;j--){
                System.out.print("*");
            }
            m--;
            System.out.println();
        }
        scn.close();
    }    
}
