package arrays;
import java.util.ArrayList;
public class basicsOfArrayList {
    public static void main(String[] args) {
        // int[] arr = {1,2,3};
        // double[] crr = {1.23,6.4,5.6};
        // char[] brr = {'A','B','C'};
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10); // arr[0] = 10
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr.size());
        // for length of array list we have to use arr.size()
        for(int i = 0;i<arr.size();i++){
            System.out.print(arr.get(i)+" "); // arr[i]
        }
        System.out.println();
      //  int n =arr[i];
        int n1 = arr.get(0);
        System.out.println(n1);
         // we print it in another way.
         // System.out.println(arr);
         System.out.println();
         arr.set(2,300); // modify
         for(int i = 0;i<arr.size();i++){
            System.out.print(arr.get(i)+" "); // arr[i]
        }
        arr.add(90); // it is known as push back.
        System.out.println();
        System.out.println(arr.size());
        for(int i = 0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

    }
    
}
