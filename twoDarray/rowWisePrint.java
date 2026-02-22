package twoDarray;

public class rowWisePrint {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6}};
        int m = arr.length,n= arr[0].length;
        int[][] transpose = new int[n][m];
        // column wise matrix or transpose
        for(int j=0;j<n;j++){
            for(int i = 0;i<m;i++){
               transpose[j][i] = arr[i][j];
            }
        }
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
