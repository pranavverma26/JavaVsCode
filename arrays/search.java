package arrays;
import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter targer element : ");
        int x = scn.nextInt();
        System.out.print("Enter array size : ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter "+(i+1)+" = ");
            arr[i] = scn.nextInt();
        }
         boolean flag = false; // false means not found.
        for(int i = 0;i<n;i++){
            if(arr[i]==x){
                flag = true; // true means found.
                break;
            }
        }
        if(flag==true) System.out.print("Element found");
        else System.out.print("Element not found");
        scn.close();
    }
    
}
