package basicSortingAlgo;
import java.util.Arrays;
public class bubbleSort {
    public static void print(int[] arr){
         for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // what is sorting ?
        // arr = {10,1,2,18,4,5} -> sort = {1,2,4,5,10,18}
        // sorted order means increasing order or ascending order or non - decreasing order.
        // Any given array is said to be sorted if arr[i] <= arr[i+1] for every i.

        // Built in sorting :-

        int[] arr = {7,1,2,8,-4};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr); // BuiltIn sort
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();


        // Bubble sort algorithm :-

        // arr = {3,1,2,5,4}
        // technique :- swapping every 2 adjacent element if arr[i] > arr[i+1]

        int[] brr = {4,3,2,1,5 };
        print(brr);
        for(int i =0;i<brr.length-1;i++){
            if(brr[i]>brr[i+1]){
                int temp = brr[i];
                brr[i] = brr[i+1];
                brr[i+1] = temp;
            }
        }
        print(brr);
         for(int i =0;i<brr.length-1;i++){
            if(brr[i]>brr[i+1]){
                int temp = brr[i];
                brr[i] = brr[i+1];
                brr[i+1] = temp;
            }
        }
        print(brr);

        // if we follow this method in example :- 5,1,3,4,2 result = 1,3,4,2,5 which is not properly sorted.
        // for complete sorting we have to apply one more loop and woa ktna time chlega = arr length - 1
        

        // Bubble sort :- 1 


        //ya sbb sa bekar bubble sort hai..
        int[] srr = {5,4,3,2,1};
        int n = srr.length;
        print(srr);
        for(int x =0;x<n-1;x++){
        for(int i =0;i<srr.length-1;i++){
            if(srr[i]>srr[i+1]){
                int temp = srr[i];
                srr[i] = srr[i+1];
                srr[i+1] = temp;
            }
         }
    }
    print(srr);
    
    // Time and Space Complexity.

    // Space Complexity (S.C) = Given array of 'n' size = O(n)
    // Auxilary Space = O(1)

    // no of operation = (n-1)^2 because both loops are independent of each other.
    // T.C = O(n^2 - 2n + 1) ~ O(n^2)

    // or hum sbb ak or baat observe kiya hai kii max element joa hai woa 1st pass(loop) mai he last mai chla jata hai so arr.length -1-x kr denga.


    // Bubble Sort :- 2

    int[] prr = {5,4,3,2,1};
        int q = prr.length;
        print(prr);
        for(int x =0;x<q-1;x++){
        for(int i =0;i<prr.length-1-x;i++){ // here x is subtracted for better time complexity. Here we only do changes.
            if(prr[i]>prr[i+1]){
                int temp = prr[i];
                prr[i] = prr[i+1];
                prr[i+1] = temp;
            }
         }
    }
    print(prr);

    // Time and Space complexity 

    // T.n.o = 
          // x = 0  -> n-1 times
          //     1  -> n-2 times
          //     .
          //     .
          //     n-2 -> 1 times

          // n-1 + n-2 + n-3.....1 (total n-1 term) = n(n-1)/2 = n^2/2 - n/2  [T.C = O(n^2)] 

    // can we optimize it further ? yes we can
    // for array like -> arr = {3,1,2,5,4} -> this can be sorted in one pass only.

    // 1). So, after every pass , we can check if that array is sorted or not.

    // Bubble sort :- 3 


    
    // int[] trr = {5,4,3,2,1};
    //     int s = trr.length;
    //     print(trr);
    //     for(int x =0;x<s-1;x++){
    //     for(int i =0;i<trr.length-1-x;i++){ 
    //         if(trr[i]>trr[i+1]){
    //             int temp = trr[i];
    //             trr[i] = trr[i+1];
    //             trr[i+1] = temp;
    //         }}
    //         boolean flag = true;
    //         for(int i=0;i<trr.length;i++){
    //             if(trr[i]>trr[i+1]){
    //                 flag = false;
    //                 break;
    //             }}
    //             if(flag == true) break;
    // }
    // print(trr);

    // for more optimised as we see that line 119,126 and 120,127 are doing same work so we can merge that.

    int[] trr = {5,4,3,2,1};
        int s = trr.length;
        print(trr);
        for(int x =0;x<s-1;x++){
            boolean flag = true;
        for(int i =0;i<trr.length-1-x;i++){ 
            if(trr[i]>trr[i+1]){
                int temp = trr[i];
                trr[i] = trr[i+1];
                trr[i+1] = temp;
                flag = false;
            }}
                if(flag == true) break;
    }
    print(trr);

    // now it is optimised but have same time complexity.


    // Stable and Unstable Sort :-

    //  1 3 3* 4 5  :- Stable sort
    //  1 3* 3 4 5  :- Unstable sort

    // ex :- 3 1 5 3* 4 
    // ->  1 3 5 3* 4
    // ->  1 3 5 3* 4
    // ->  1 3 3* 5 4
    // ->  1 3 3* 4 5    Bubble sort is stable because it never swaps equal elements, so the relative order of equal elements stays the same.

    // Q)1. How much maximum swaps are needed to sort array of length 6 ?

    // Soln :- 15 swaps [5(pass 1 mai)+4(pass 2 and so on)+3+2+1]

    // In general : - n-1 + n-2 + n-3 ...1
    // = n(n-1)/2  [max swap]


    // Q)2. Push zeroes to end while maintaining the relative order of the elements.[leet code :-283]

     int[] krr = {0,1,0,3,12};
        print(krr);
        int noz = 0;
        for(int ele : krr){
            if(ele==0) noz++;
        }

        for(int x =0;x<=noz;x++){  // jtna number of zeroes hai utna hea ya wala loop chelga because harr pass/loop mai zero last mai chla jaeyga so jyada time loop chlana ka koi fayda nhi hai.
            boolean flag = true;
        for(int i =0;i<krr.length-1-x;i++){   
            if(krr[i]==0){
                int temp = krr[i];
                krr[i] = krr[i+1];
                krr[i+1] = temp;
                flag = false;
            }}
                if(flag == true) break;
    }
    print(krr);

    int lp = 5;
    String qel = Integer.toString(lp);
    String qel2 = String.valueOf(lp);
    System.out.println(" n = "+lp);







    
        
    }
    
}
