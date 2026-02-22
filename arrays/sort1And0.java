package arrays;

public class sort1And0 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1};
        int n = arr.length;
        int cnt =0;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                cnt++;
            }
        }
        for(int i =0;i<cnt;i++){
            arr[i]=0;
        }
        for(int i =cnt;i<n;i++){
            arr[i]=1;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }

        }
}
    

