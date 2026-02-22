package basicSortingAlgo;

public class insertionSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }


    public static void main(String[] args) {
        // Q). Sort a given array in decreasing order using bubble sort.
        int[] trr = {7,16,1,11,-3};
        int s = trr.length;
        print(trr);
        for(int x =0;x<s-1;x++){
            boolean flag = true;
        for(int i =0;i<trr.length-1-x;i++){ 
            if(trr[i]<trr[i+1]){
                int temp = trr[i];
                trr[i] = trr[i+1];
                trr[i+1] = temp;
                flag = false;
            }}
                if(flag == true) break;
    }
    print(trr);

    // Q). Sort a given Array in increasing order using selection sort, but in each pass, put the kth maximum element at the right position.




                                                 // Insertion Sort Algorithm
                                                        
    // example :- you have playing cards numbered from 1 to 10 in random order. You have to sort them .
    // eg :- 3 5 1 4 2
    // 3 5 1 4 2
    // 1 3 5 4 2
    // 1 3 4 5 2
    // 1 2 3 4 5  now it is sorted and this sorting is known as insertion sort.

    // int[] arr = {3,5,1,4,2};
    // print(arr);
    // int n = arr.length;
    // for(int i=0;i<n-1;i++){
    //     for(int j =i;j>=1;j--){
    //         if(arr[j]<arr[j-1]){
    //             swap(arr,j,j-1);
    //         }

    //     }
    // }


    // print(arr);
    int[] arr = {5, 3, 4, 1, 2};
print(arr);
int n = arr.length;
// for(int i=0;i<n-1;i++){
//     if(arr[i]>arr[i+1]){
//         swap(arr,i,i+1);
//         for(int j =i;j>0;j--){
//             if(arr[j]<arr[j-1]){
//                 swap(arr,j,j-1);        My logic
//             } 
//             else break;
//         }
//     }
// }
for(int i=0;i<n;i++){
    for(int j=i;j>=1;j--){  // for(int j=i;j>=1 && arr[j]<arr[j-1];j--) then there is no need of if and else so it is best.
        if(arr[j]<arr[j-1]){  
        swap(arr,j,j-1);}
    
    else break;}
}
print(arr);

                                 // By using while loop  and standard method

// for(int i=0;i<n;i++){
//     int j = i;
//     while(j>=1 && arr[j]<arr[j-1]){ 
//         swap(arr,j,j-1);
//         j--;
    
//     }
    
// }
// }

// Time and Space Complexity :-

// Avg case = O(n^2)
// Best case = O(n)  0 1 2 3 4
// Worst Case = O(n^2) 5 4 3 2 1


                                                // Stability of insertion sort

                            // eg :- 1 3 3* 5 2
                    // After sorting we get :-  1 2 3 3* 5 which is stable because order nhi bigra. So we say that Insertion sort is a stable sort

    
     

                                                                            

        
    }
    
}
