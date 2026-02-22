package twoDarray;
public class addTwoMatrice {
    public static void main(String[] args) {
        int[][] arr1 = {{1,9,2},{3,7,4},{8,5,6}};
        int[][] arr2 = {{9,3,7},{8,5,6},{2,4,1}};

        // int[][] res = new int[3][3];
        for(int i=0;i<arr1.length;i++){
            for(int j = 0;j<arr1[0].length;j++){
                // res[i][j] = arr1[i][j]+arr2[i][j];
                arr1[i][j]+=arr2[i][j]; // without using extra array.
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j = 0;j<arr1[0].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
