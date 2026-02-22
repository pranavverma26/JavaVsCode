package patternPrinting;
import java.util.Scanner;
public class numberSpiral {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =  scn.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(j==1 || i==1){
                    System.out.print(n);
                }
                if(i==2||j==2){
                    System.out.print(n-1);
                }
                if(i==3||j==3){
                    System.out.print(n-2);
                }
                if(i==4 && j==4){
                    System.out.print(n-3);
                }
            }
            System.out.println();
        }
        scn.close();
    }
    
}
