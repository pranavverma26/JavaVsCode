package twoDarray;
import java.util.*;
public class ArrayListPascalTriangle {
    public static void main(String[] args) {
        // Given an integer 'numRows',generate Pascal's triangle.
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scn.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
        for(int i =0;i<n;i++){
            List<Integer> l = new ArrayList<>();
            for(int j =0;j<=i;j++){
                if (j==0 || j==i) l.add(1);
                else l.add(arr.get(i-1).get(j) + arr.get(i-1).get(j-1));
            }
            arr.add(l);
        }
        for(int i =0;i<arr.size();i++){
            n--;
            for(int j = n;j>0;j--){
                System.out.print(" ");
        
            }
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");

            }
            System.out.println();

        }
        scn.close();
    

    }
    
}
