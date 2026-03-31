package SlidingWindow;
public class MaxSumSubArraySizeK {
    public static void main(String[] args) {
        int[] arr = {10,20,1,3,-40,80,10};
        int k=3;
        int maxSum=0;
        // for(int i=0;i<arr.length-k+1;i++){
        //     int sum=0;
        //     for(int j=i;j<=i+k-1;j++){
        //         sum+=arr[j];

        //     }
        //     maxSum=Math.max(maxSum,sum);
        // }
        //                 Sliding Windows
        int sum=0;
        int j=0;
        int i=0;
        while(j<k){
            sum+=arr[j];
            j++;
        }
        i++;
        while(j<arr.length){
            sum=sum-arr[i-1]+arr[j];
            maxSum=Math.max(maxSum,sum);
            i++;
            j++;
        }
        System.out.println(maxSum);
    }
}
