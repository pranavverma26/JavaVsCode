package arrays;

public class min {
    public static void main(String[] args) {
        int[] arr = {4,5,89,75,1,35};
        int mn = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<mn) mn = arr[i];
        }
        System.out.println("Minimum number among them = "+mn);
    }
    
}
