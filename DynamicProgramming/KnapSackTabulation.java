public class KnapSackTabulation {
    public static void main(String[] args) {
        int[] wt ={2,3,4,5};
        int[] val ={1,2,5,6};
        int c=8;
        int[][] dp = new int[wt.length][c+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
               int skip = (i>0) ? dp[i-1][j] : 0;
               if(wt[i]>j) dp[i][j]=skip;
               else{
                int pick=val[i];
                pick += ((i>0) ? dp[i-1][j-wt[i]] : 0);
                dp[i][j]=Math.max(pick,skip);
               }
            }
        }
        System.out.println(dp[wt.length-1][c]);
    }    
}
