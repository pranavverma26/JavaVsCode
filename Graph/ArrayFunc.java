package Graph;
import java.lang.Math;
import java.util.HashMap;
import java.util.HashSet;;
public class ArrayFunc {
    private static void  ArrChng(int[] arr){
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
            return;
    }
    private static void PrimeArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            if(ele<4) arr[i]=ele;
            else{
                int j=2;
                while(j<=Math.sqrt(ele)){
                    if(ele%j==0){
                        ele++;
                        j=2;
                        continue;
                    }
                    j++;
                }
            arr[i]=ele;
            }
        }
        return;
    }
    // private static boolean CheckPrime(int j){ use recursion
        

    // }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return;
    }

    public static void main(String[] args) {
        int[] arr = {8,13,15,23,51};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        ArrChng(arr);
        System.out.println();
        PrimeArray(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        // Reverse array in range
        int i=2;
        int j=3;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int k=0;k<arr.length;k++){
        if(map.containsKey(arr[k])){
            map.put(arr[k],map.get(arr[k])+1);
        }
        else{
            map.put(arr[k],1);
        }
    }
    for (int key : map.keySet()) {
        System.out.println("Key: "+ key + ",Value: " + map.get(key));
}


    }
    
}
