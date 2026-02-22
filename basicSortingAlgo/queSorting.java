package basicSortingAlgo;
import java.util.Arrays;

public class queSorting {
     public static void print(int[] arr){
         for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Q 4). What will the array look like after the first iteration of selection sort [2,3,1,6,4]

        // Ans = [1,3,2,6,4]    In every pass we find the kth smallest element(1st,2nd...element) and put it in its right place.


        // Q) 5. Which sorting technique is used here ?
        // A player is sorting a deck of cards numbered from 1 to 52. She first picks one card then picks the next card and puts it after the first card
        // if it is bigger or before the first card if it is smaller, then she picks another card and puts it into its proper position.

        // ans = insertion sort

        // Q) 6.which of the following sort is not a stable sorting algorithm ?

        // ans = selection sort.

        // Q) 7. Leet code question(169) :- Majority element (majority elements present more then n/2)

        // using built in sort.

        int[] arr = {2,2,2,2,1,1,4,2,12,2,2};
        Arrays.sort(arr);
        System.out.print("Majority element ="+arr[arr.length/2]);
        System.out.println();


        // Q) 8. Givenn an array with n distinct elements and all the +ve , convert the given array to a form where all elements are in the range from 0 to N-1.The order of
        // elements is the same ,i.e., 0 is placed in the place of the smallest element, 1 is placed for the second smallest element,...N-1 is placed for
        // the largest element.
        int[] trr = {54,11,28,47,91,63};
        print(trr);
        int n= trr.length;
        int p=0;
        for(int i=0;i<n;i++){
            int mx =Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(j==p){
                    continue;}
                if(trr[j]<mx){
                    mx = trr[j];
                    p =j;
                }
            }
            

        }
        print(trr);

        


    }
    
}
