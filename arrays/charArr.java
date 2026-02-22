package arrays;
import java.util.Scanner;
public class charArr {

    public static void main(String[] args) {
        char[] arr = {'a','1','b'};
        String[] trr = {"Shyam","134","Hello"};
        int[] prr = new int[3];
        Scanner scn = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 0;i<trr.length;i++){
            System.out.print(trr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<prr.length;i++){
            prr[i] = scn.nextInt();
        }
         for(int i = 0;i<arr.length;i++){
            System.out.print(prr[i]+" ");
        }
        scn.close();

    }
    
}
