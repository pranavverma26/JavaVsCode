public class SubSet_Sum {
    // public static boolean subset(int i,int[] arr,int target,int[][] dp){
    //     if(i==arr.length){
    //         if(target==0) return true;
    //         else return false; 
    //     }
    //     if(dp[i][target] != -1) return (dp[i][target]==1);
    //     boolean ans= false;
    //     boolean skip=subset(i+1,arr,target,dp);
    //     if(target-arr[i]<0) ans=skip;
    //     else{
    //         boolean pick=subset(i+1,arr,target-arr[i],dp);
    //         ans=pick||skip;

    //     }
        
    //     if(ans) dp[i][target]=1;
    //     else dp[i][target]=0;
    //     return ans;
    // }
    public static boolean subset(int i,int[] arr,int target){
        if(i>=arr.length){
            if(target==0) return true;
            else return false;
        }
        boolean take=false;
        if(target-arr[i]>=0){
            take=subset(i+1,arr,target-arr[i]);
        }
        boolean skip = subset(i+1,arr,target);

        return skip || take;
    }
    public static void main(String[] args) {
        int[] arr={8,5,2,4};
        int target=1;
        int[][] dp = new int[arr.length][target+1];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=target;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(subset(0,arr,target));
    }
    
}
