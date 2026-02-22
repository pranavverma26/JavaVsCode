package twoDarray;

public class rotate2ndmthd {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,8},{4,5,6,2},{7,8,9,4},{6,5,8,3}};
        int n= arr.length,p=n;
        int [][] rotate = new int[n][n];
        print(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotate[j][p-1]=arr[i][j];
            }
            p--;  
        }
        print(rotate);
        
    }
    public static void print(int[][] matrix){
        int m = matrix.length;
        for(int i =0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
    
}
