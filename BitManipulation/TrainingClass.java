package BitManipulation;
import java.util.ArrayList;
public class TrainingClass {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    static void printSubarrays(int[] arr, int start, int end) {
        if (start == arr.length)
            return;
        if (end == arr.length) {
            printSubarrays(arr, start + 1, start + 1);
            return;
        }
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        printSubarrays(arr, start, end + 1);
    }

    public static void main(String[] args) {
        // Pattern print
        int n =5;
        int count=1;
        int[] arr = {1,2,3,4,5,6};
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(count%2==0) System.out.print("0");
                else System.out.print("1");
                count++;
            }
            System.out.println();
        }
        // Equal Sum
        int i=0;
        int j=arr.length-1;
        int leftSum=0;
        int RightSum=0;
        while(i<j){
            leftSum+=arr[i];
            RightSum+=arr[j];
            i++;
            j--;
        }
        if(leftSum==RightSum) System.out.println("Balanced");
        else System.out.println("Unbalanced");

        // Target Sum idx

        int sum=0;
        int tar=20;
        int idx=0;
        for(int s=0;s<tar && s<arr.length;s++){
            if(sum<tar) sum+=arr[s];
            idx=s;
        }
        for(int s=0;s<idx;s++){
            System.out.print(arr[s]+" ");
        }
        System.out.println();
        System.out.print(sum);

        // Print Subarray
        System.out.println();
        printSubarrays(arr, 0, 0);
    }
    
}
