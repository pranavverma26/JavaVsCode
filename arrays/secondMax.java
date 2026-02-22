package arrays;

public class secondMax {
    public static void main(String[] args) {
        int[] arr = {4,5,89,83,75,1,35};
        int mx = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>mx) mx = arr[i];
        }
        int scnmx = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] != mx){
            if(arr[i]>scnmx) scnmx = arr[i];
        }}
        System.out.println("Second max number among them = "+scnmx);
    }
    
}

