package BinarySearch;
import java.util.ArrayList;
import java.util.Collections;
public class kClosetEle9 {
    public static void main(String[] args) {
        ArrayList<Integer> trr = new ArrayList<>();
        int[] arr = {0,1,2,3,4,5,6,7};
        int k = 3;
        int x = 5;
        int n = arr.length;
        int lo =0,hi =n-1;
        int lb = n;
        if(x<arr[0]){
            for(int i=0;i<k;i++){
                trr.add(arr[i]);
            }
        }
        if(x>arr[n-1]){
            for(int i =(n-1);i>=n-k;i--){
                trr.add(arr[i]);
            }
        }
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=x){
                lb = mid;
                hi = mid -1;
            }
            else lo = mid +1;
            
        }
        int i=lb-1,j=lb;
        while(k>0 && i>=0 && j<n){
            int di = Math.abs(x-arr[i]);
            int dj = Math.abs(x-arr[j]);
            if(di<=dj){
                trr.add(arr[i]);
                i--;
            }
            else{
                trr.add(arr[j]);
                j++;
            }
            k--;
        }
        while(i<0 && k>0){
            trr.add(arr[j]);
            j++;
            k--;
        }
        while(j==n && k>0 ){
            trr.add(arr[i]);
            i--;
            k--;
        }
    Collections.sort(trr);
    for(int s=0;s<trr.size();s++){
        System.out.print(trr.get(s)+" ");
    }
    }
    
}
