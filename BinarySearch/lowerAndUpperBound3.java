package BinarySearch;

public class lowerAndUpperBound3 {
    public static void main(String[] args) {

        //Q)1. Given a sorted integer array and an integer 'x', find the lower bound of x. [ smallest idx such that arr[idx]>=x]

        /*  arr = {10,20,30,30,40,50,60,70}

            x = 40         x = 30          x = 35        x = 25           x = 80               x = 5
            lb = 4         lb = 2          lb = 4        lb = 2           lb = 8               lb = 0
         */
        int[] arr = {10,20,30,30,40,50,60,70};
        int lo=0,hi=arr.length-1;
        int x = 30,idx=arr.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            if(arr[mid]>=x){
                idx = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        System.out.println(idx);
        
        

        //Q)2. Given a sorted integer array and an integer 'x', find the upper bound of x. [ smallest idx such that arr[idx]>x]

       int[] trr = {10,20,30,30,40,50,60,70};
        int l=0,h=trr.length-1;
        int y = 30,indx=trr.length;
        while(l<=h){
            int m = l + (h-l)/2 ;
            if(trr[m]>y){
                indx = m;
                h = m-1;
            }
            else l = m+1;
        }
        System.out.println(indx);




        
    }
    
}
