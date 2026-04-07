public class SubsetSum_tabulation {
    public static void main(String[] args) {
         int[] nums={8,5,1,4};
        int target=7;
        int[][] dp = new int[nums.length][target+1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=target;j++){
                boolean ans = false;
                boolean skip = (i>0) ? (dp[i-1][j]==1) : (j==0);
                if(j-nums[i]<0) ans=skip;
                else{
                    boolean pick = (i>0) ? (dp[i-1][j-nums[i]]==1) : (j==0);
                    ans= pick || skip;
                }
                dp[i][j] = (ans) ? 1 : 0;
            }
        }
        System.out.println(dp[nums.length-1][target]==1);
    }
    
}
