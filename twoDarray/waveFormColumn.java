package twoDarray;

public class waveFormColumn {
    public static void Print(int arr[][]){
    for(int[] ele:arr){
        for(int x :ele){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    

    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int m = arr[0].length;
        Print(arr);
        for(int j = 0;j<m;j++){
            int p = n-1;
            for(int i=0;i<n;i++){
                if(j%2==0){
                    System.out.print(arr[p][j]+" ");
                    p--;
                }
                else{
                    System.out.print(arr[i][j]+" ");
                
                }
            }
            
        }
    }
    
}
