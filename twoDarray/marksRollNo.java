package twoDarray;
import java.util.Scanner;;
public class marksRollNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[4][2];
        for(int i =0;i<4;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=scn.nextInt();
            }}
        for(int i =0;i<4;i++){
            for(int j =0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }    
        scn.close();
        
    }
    
}
