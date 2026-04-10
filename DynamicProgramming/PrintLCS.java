public class PrintLCS {
    public static void main(String[] args) {
        String a  = "abcde";
        String b = "ace";
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
           for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                    if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                    else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
        }
        StringBuilder ans= new StringBuilder("");
        int i=m;
        int j=n;
        while(i>0 && j>0){
                if(a.charAt(i-1)==b.charAt(j-1)) ans.append(a.charAt(i-1));
                if(dp[i-1][j]>dp[i][j-1]) i=i-1;
                else j--;
            }
        ans.reverse();
        System.out.println(ans);
        }

    }
    

