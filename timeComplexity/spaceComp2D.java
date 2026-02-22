package timeComplexity;

public class spaceComp2D {
    public static void main(String[] args) {
        // space complexity of creating a 2d matrix.

        // inr[][] a = new int[n][m];

        // total elements = n*m

        // S.C. = O(n*m)
        
        // Q). What will be the space time complexity if we create 3 arrays of the same size.

        // int[] a = new int[n];
        // int[] b = new int[n];
        // int[] c = new int[n];

        // for(int i=0;i<n;i++){
        //     c[i]++;
        // }  yha c array mai one chla jega prr isha space complexity mai koi fraq nhi pdega bcz ushma phla sa he zero hai.

         // time = n
         // space = n + n + n = 3n
         // T.C = O(n)
         // S.C. = O(3n) ~ O(n)
    }
    
}
