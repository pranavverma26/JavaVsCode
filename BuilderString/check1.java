package BuilderString;

public class check1 {
     public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int[] nums= {2,3,2};
        int n=nums.length;
        int[] ans = new int[2];
        int i=0;
        while(i<n){
            if((nums[i]==n && i != n-1) || (nums[i]!=(i+1) && nums[i]!=nums[nums[i]-1]) ) swap(nums,i,nums[i]-1);
            else i++;
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
               ans[0]=nums[j];
               ans[1]=(j+1);
            }
        }
        
        for(int ele:ans){
            System.out.print(ele+" ");
        }
        // System.out.println(nums[0]);
    }
    
}
