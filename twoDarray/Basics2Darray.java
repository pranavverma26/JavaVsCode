package twoDarray;
import java.util.Scanner;
public class Basics2Darray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r =scn.nextInt();
        System.out.print("Enter c:");
        int c = scn.nextInt();
        int[][] arr = new int[r][c];
        int p = 1;
        int m = arr.length; // no of rows or lines.
        int n = arr[0].length; // no of columns.
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Element "+p+"=");
                arr[i][j]=scn.nextInt();
                p++;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(m); // no of rows.
        System.out.println(n); // no of columns.
        scn.close();

    }
    
}
    

