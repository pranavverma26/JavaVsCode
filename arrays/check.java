package arrays;

import java.util.ArrayList;
import java.util.List;

public class check {
     public static void swap(int[] nums,int i,int j){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
    }
   public static void main(String[] args){
    int[] nums ={4,3,2,7,8,2,3,1};
    int n= nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<n){
            if(nums[i]!=nums[nums[i]-1] && nums[i]!=i+1){
                swap(nums,i,nums[i]-1);
            }
            else i++;
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) ans.add(i+1);
        }
        System.out.println(ans);
    }
    
}
