import java.util.HashSet;
public class HashSet_Iterate2 {
    public static void main(String[] args) {
        // Why we can not iterate through for/while loop ?
        // Because there is no concept of index.
        // So we use for each loop.
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {4,9,2,6,4,8,1};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
         for(int ele : set){
            System.out.print(ele+" ");
        }
        // set.clear() use to remove all the elements of hashSet.

        HashSet<String> s = new HashSet<>();
        System.out.println();
        s.add("Pranav");
        s.add("Pranav");
        s.add("Pranav");
        s.add("Pranav");
        s.add("Pranav");
        System.out.println(s+" "+s.size());
        s.remove("Pranav");
        System.out.println(s);


    }
    
}
