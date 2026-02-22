package basicSortingAlgo;
public class selectionSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // In bubble sort adjacent element ki swaping hoti hai and In Selcetion sorting adjacent element ki swaping nhi hoti hai..

        // In every pass we find the kth smallest element(1st,2nd...element) and put it in its right place.
    /*     
         arr =  3 5 2 1 4   pass 1
                1 5 2 3 4   pass 2
                1 2 5 3 4   pass 3
                1 2 3 5 4   pass 4 
                1 2 3 4 5   pass 5    this is known as slection sorting.
                
*/
        int[] arr = {10,-4,20,1,-6,8,-122};
        print(arr);
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int min=Integer.MAX_VALUE,s=0;
            for(int j =i;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    s=j;
                }           
            
            }
            int temp = arr[i];
            arr[i] = arr[s];
            arr[s] = temp;
            // swap krna kii time and complexity O(1) hoti hai..
            
        }
        print(arr);

        // Time and Space complexity :-

        /* 
          i = 0 -> j = 0,1,2,3..n-1 -> n times
              1 -> j = 1,2,3..n-1 ->  n-1 times
              2 -> j= 2,3..n-2 times
              .
              .
              .
              n-2

              no of operation = n + n-1 + n-2 + n-2 ... 1
                              = n(n+1)/2 = n^2/2 + n/2  here no of operation is greater then of operatin in bubble sort
                              so bubble sort is better method then selection sort.

             T.C = O(n^2)
             Auxillary space = O(1)


             Comparison of selection sort and Bubble sort :-

             eg1 :-
             3 4 5 3* 1
             1 4 5 3* 3
             1 3* 5 4 3
             1 3* 3 4 5
             1 3* 3 4 5  -> Unstable sort

             eg2 :-
             3 4 1 3* 5
             1 4 3 3* 5
             1 3 4 3* 5
             1 3 3* 4 5
             1 3 3* 4 5  -> Stable sort [But hum stable sort tbb he khenga jbb harr time stable sort hoa.]

             so selection sort hamesa unstable hota hai.

                      Selection sort                                          Bubble sort
                      cannot be optimised                                     can be optimised
                      Unstable sort                                           Stable sort
                      No of swaps are less.                                   No of swaps are more
                      = n-1 swaps                                             = n(n-1)/2 max swaps
                      Best case T.C is O(n^2)                                 Best case T.C is O(n) so it is much faster and much better.   

                      if cost of swapping is something consider then selection sort is better.

                                                              Time complexity
                                                    B.S                               S.S          

                        Avg case                  O(n^2)                            O(n^2)

                        worst case                O(n^2)                            O(n^2)

                        Best case             O(n)(array phla sa sorted hai)         O(n^2)

         */
    }
    
}
