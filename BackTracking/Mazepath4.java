package BackTracking;

public class Mazepath4 {
    public static void main(String[] args) {
        int r = 2;
        int c = 2;
        boolean[][] arr = new boolean[r][c];
        path4(0,0,r-1,c-1,"",arr);
    }

    private static void path4(int i, int j, int r, int c, String s, boolean[][] arr) {
        if(i<0 || j<0) return;
        if(i>r || j>c) return;
        if(arr[i][j]==true) return;
        if(i==r && j==c){
            System.out.println(s);
            return;
        }
        arr[i][j]=true;
        // go right
        path4(i,j+1,r,c,s+"R",arr);
        // go down
        path4(i+1,j,r,c,s+"D",arr);
        // go left
        path4(i,j-1,r,c,s+"L",arr);
        // go up
        path4(i-1,j,r,c,s+"U",arr);

        arr[i][j]=false;
       
    }
    
}
