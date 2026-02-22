package Recurssion;
import java.util.Scanner;
public class mazePath9 {
    public static int maze1(int row,int col,int m, int n){
        if(row==m || col == n) return 1;
        int rightWays = maze1(row,col+1,m,n);
        int downWays = maze1(row+1,col,m,n);
        return rightWays + downWays;
    }
    public static int maze2(int m,int n){
        if(m==1 || n==1) return 1;
         int rightWays = maze2(m,n-1);
        int downWays = maze2(m-1,n);
        return rightWays + downWays;

    }

    // Q) Given a (m*n) grid uou have to reach from top left corner to bottom right corner. 
    // You can go either down or right at a time. Find the number of paths.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scn.nextInt();
        System.out.print("Enter m : ");
        int m = scn.nextInt();
        System.out.println(maze1(1,1,m,n));
        System.out.println(maze2(m,n));
        scn.close();
        
        
    }
    
}
