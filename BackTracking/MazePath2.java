package BackTracking;

public class MazePath2 {
    public static void main(String[] args) {
        int r =3;
        int c =3;
        int count = path(1,1,r,c);
        System.out.println(count);
    }

    static int path(int i, int j, int r, int c) {
        if(i>r || j>c) return 0;
        if(i==r && j==c) return 1;
        return path(i+1,j,r,c) + path(i,j+1,r,c);
        
    }
    
}
