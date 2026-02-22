package twoDarray;

public class waveformMatrix {
    public static void Print(int arr[][]){
    for(int[] ele:arr){
        for(int x :ele){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    }
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length,m=arr[0].length;

        Print(arr);
        for(int i=0;i<n;i++){
            int p =arr[0].length-1;
            for(int j=0;j<m;j++){
                if(i%2==0){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print(arr[i][p]+" ");
                    p--;

                }
            }
            
        }
        
        
    }
    
}
