package BitManipulation;
public class Pattern {
    public static void main(String[] args){
        int n=9;
        int mid = n/2;
        for(int i=0;i<n;i++){
            int dist = Math.abs(mid-i);
            int left = dist;
            int right =n-1-dist;
            for(int j=0;j<=n;j++){
                if(j>=left && j<=right){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
    
}
