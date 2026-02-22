package patternPrinting;
import java.util.Scanner;
public class floyasTriangle {
    public static void main(String[] args) {
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int n = scn.nextInt();
        int a =1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a +" ");
                a++;
            }
            System.out.println();
        }
        scn.close();
    }
    
}

