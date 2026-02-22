package BinarySearch;

public class firstAndlast4 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Find First and Last Position of elements in sorted array.

        // leet code :- 34

        // arr = {10,10,20,20,20,20,20,30,30,30,40,40} if x = 20 then we have to find when 20 is first appeared and last appeard here fp = 2 and lp = 6

        // int[] arr = {10,10,15,20,20,20,20,20,30,30,30,40,40,40};
        // int[] ans = {-1,-1};
        // int lo =0,hi=arr.length-1;
        // int x =15;
        // int fp=0,lp=0;
        // boolean flag = false;
        // while(lo<=hi){
        //     int mid = lo + (hi-lo)/2;
        //     if(arr[mid]==x){
        //         flag = true;
        //         break;
        //     }
        //     else if(arr[mid]>x) hi = mid -1;
        //     else if(arr[mid]<x) lo = mid +1;
        //     }
        // if(flag==false) print(ans);
        // else{
        // lo=0;hi=arr.length-1;
        // while(lo<=hi){
        //     int mid = lo + (hi-lo)/2;
        //     if(/*mid>=0 && */arr[mid]>=x){
        //         fp = Math.min(fp,mid);
        //         hi = mid -1;}
        //     else lo =  mid + 1;
        // }
        // ans[0] = fp;
        // lo=0;hi=arr.length-1;
        // while(lo<=hi){
        //     int mid = lo + (hi-lo)/2;
        //     if(/*mid<arr.length && */arr[mid]>x){
        //         lp = Math.min(lp,mid);
        //         hi = mid -1;}
        //     else lo =  mid + 1;
        // }
        // ans[1] = lp-1;
        // print(ans);}

        //                                                  Best method for this :-
        int[] arr = {10,10,15,20,20,20,20,20,30,30,30,40,40,40};
        int lo =0,hi=arr.length-1;
        int x =40;
        int fp=0,lp=0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == x){
                if(mid>0 && arr[mid]==arr[mid-1]){
                    hi = mid -1;
                }
                else {fp = mid;
                       break;}         
            }
            else if(arr[mid]>x) hi = mid-1;
            else if(arr[mid]<x) lo = mid+1;
        }
        lo=0;hi=arr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == x){
                if(mid<arr.length-1 && arr[mid]==arr[mid+1]){
                    lo = mid +1;
                }
                else {lp = mid;
                       break;}         
            }
            else if(arr[mid]>x) hi = mid-1;
            else if(arr[mid]<x) lo = mid+1;
        }
        System.out.println(fp+","+lp);
        

                           

    }
    
}
