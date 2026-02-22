package twoDarray;

public class largestELE {
    public static void main(String[] args) {
        int[][] arr = {{1,56,74},{14,101,36},{11,97,3}};
        int mx = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                if(arr[i][j]>mx){
                    mx=arr[i][j];
                }
                sum+=arr[i][j];
            }
        }
        System.out.println("Largest element of a given 2D array = "+mx);
        System.out.println("total sum of elements = "+sum);
    }
    
}
