public class SubStringLength {
    public static void main(String[] args) {
        String a  = "abc";
        String b = "abc";
        int m = a.length();
        int n = b.length();
        int max=0;
        int[][] dp = new int[m+1][n+1];
           for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                    if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                    else{
                        dp[i][j]=0;
                    }
                    max = Math.max(max,dp[i][j]);
                }
        }
        System.out.println(max);
    }
    
}
