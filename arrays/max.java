package arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {23,45,6,7,89,11,5,92};
        int mx = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>mx) mx = arr[i];
        }

        System.out.print("The maximum value out of all the elements in the array = "+mx);
    
    }
    
}
