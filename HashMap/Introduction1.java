import java.util.HashSet;
public class Introduction1{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // In HashSet, occurence of every element is 1.

        set.add(20);
        set.add(100);
        set.add(10);
        System.out.println("Size is "+set.size());
        set.add(-8);
        set.remove(100);
        set.add(200);
        System.out.println("Size is "+set.size());
        System.out.println(set);
        // search - true/false : TC = O(1)
        System.out.println(set.contains(50));
        set.add(50);
        System.out.println("Size is "+set.size());

        System.out.println("Set contains =" +set.contains(50));
        // if agar koi element set k andar exist nhi krta hai toa phr usko remove krenga toa error nhi aeyga
        Object[] arr = set.toArray(); 
        for(Object p : arr){
            System.out.print(p+" ");
        }


    }

}