package patternPrinting;
import java.util.Scanner;
public class pattren6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int n = scn.nextInt();
        for(int i = 1;i<=n;i++){
            char p = 'A';
            for(int j = 1;j<=i;j++){
                if(i%2==0){
                    System.out.print(p+" ");
                    p++;
                }
                else{
                    System.out.print(j+" ");
                    
                }
            }
            System.out.println();
        }
        scn.close();
    }
    
}
