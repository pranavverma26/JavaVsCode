package twoDarray;
import java.util.*;
public class TwoDarrayListBasic {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);a.add(20);a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40);b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a);l.add(b);l.add(c);l.add(d);
        
        //To get a element:-
        System.out.println(l.get(1).get(1));
        for(int i =0;i<l.size();i++){
            for(int j=0;j<l.get(i).size();j++){
                System.out.print(l.get(i).get(j)+" ");

            }
            System.out.println();

        }
        System.out.println("After clear nothing will print.");
        l.clear();
        for(int i =0;i<l.size();i++){
            for(int j=0;j<l.get(i).size();j++){
                System.out.print(l.get(i).get(j)+" ");

            }
            System.out.println();

        }

        /*  Basic STL functions in ArrayList 
        
        1. add() = add in end
        2. remove() = remove from end
        3. get() = use to print the element
        4. clear() = clear the list.
        5. isEmpty = check the arrayList is empty or not .
        6. Contains = 
        7. indexOf() = 
        8. toArray = convert 1D array list to array*/
        
    }
    
}
