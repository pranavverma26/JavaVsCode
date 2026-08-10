package Graph;
import java.util.Scanner;
import java.util.HashSet;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1,4,4,4,4,4,7,8};
        // int val=0;
        // for(int i=1;i<=n;i++){
        //         for(int k=i;k<n;k++){
        //             System.out.printf("%2s","");
        //         }
        //     for(int j=0;j<i;j++){

        //         if(j==0){
        //             System.out.printf("%4d",i);
        //             val=i;
        //         }
        //         else{
        //             System.out.printf("%4d",val+(n-j));
        //             val=val+(n-j);
        //         }
                
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=n;i++){
        //     for(int k=i;k<n;k++){
        //         System.out.printf("%2s","");
        //     }
        //     for(int j=1;j<=i;j++){

        //         System.out.printf("%2d",j);
        //     }
        //     for(int j=i-1;j>0;j--){
        //         System.out.printf("%2d",j);
        //     }
        //     System.out.println();
        // }
        // sc.close();
                                     // first and last
        int lo=0;
        int hi=arr.length-1;
        int fp=0;
        int lp=0;
        // For first post
        int tar=4;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==tar){
                if(mid>0 && arr[mid-1]==tar){
                    hi=mid-1;
                }
                else{
                    fp=mid;
                    break;
                }
            }
            else if(arr[mid]>tar) hi=mid-1;
            else if(arr[mid]<tar) lo=mid+1;
        }
        // for last pos
        lo=0;
        hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==tar){
                if(mid<arr.length-1 && arr[mid+1]==tar){
                    lo=mid+1;
                }
                else{
                    lp=mid;
                    break;
                }
            }
            else if(arr[mid]>tar) hi=mid-1;
            else if(arr[mid]<tar) lo=mid+1;
        }
        System.out.println(fp+" "+lp);




    }
}
