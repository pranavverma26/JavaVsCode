package patternPrinting;
import java.util.Scanner;
public class numberBridge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =  scn.nextInt();
        int p =n;
        for(int j =1;j<=2*n-1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("  ");
            }
            for(int j=p+1;j<=2*n-1;j++){
                System.out.print(j+" ");
            }
            p++;
            System.out.println();
        }
        scn.close();
    }
}
