package twoDarray;
import java.util.*;
import java.util.ArrayList;
public class Multiplication {
     public static void Print(int arr[][]){
    for(int[] ele:arr){
        for(int x :ele){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    System.out.println();

    }

    public static void main(String[] args) {
        int[][] a = {{1,2,1},{2,1,2}};
        int[][] b = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        int[][] c = new int[a.length][b[0].length];
        if(a[0].length !=b.length){
            System.out.println("Multiplication not possible");
        }
        else{
        for(int i = 0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k = 0;k<b.length;k++){
                c[i][j]+=a[i][k]*b[k][j];}
            }
        }
        Print(a);
        Print(b);
        Print(c);}

    }
    
}
