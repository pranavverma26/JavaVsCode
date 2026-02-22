package arrays;

public class sort0and1and2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,2,1,0,0};
        int n = arr.length;
        int noOfZero =0,noOfOne =0;
        for(int i =0;i<n;i++){
            if(arr[i]==0) noOfZero++;
            if(arr[i]==1) noOfOne++;
        }
        for(int i =0;i<noOfZero;i++){
            arr[i] =0;
        }
        for(int i=noOfZero;i<n;i++){
            if(i<noOfZero+noOfOne) arr[i]=1;
            else arr[i]=2;
            
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
    
}
