package arrays;
import java.util.Scanner;
public class doubletSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter x: ");
        int  x = scn.nextInt();
    int[] arr = {20,3,8,4,61,7,1};
    for(int i =0;i<arr.length;i++){
        for(int j =i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==x){
                System.out.println("Doublet whose sum is "+x+" = "+arr[i]+","+arr[j]);
                
            }
        }
        
        }
        scn.close();
    }
    }    

