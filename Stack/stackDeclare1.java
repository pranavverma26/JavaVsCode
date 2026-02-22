package Stack;
import java.util.Stack;
public class stackDeclare1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(10);
        st.push(15);
        st.push(20);
        System.out.println(st);
        System.out.println(st.peek());
        st.push(25);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.size());
        // To get access of the first element we have to remove the upper element

        while(st.size()>1){
            st.pop();
        }
        // Now size becomes 1
        // Time complexity to get 1st element is O(n).
        System.out.println(st);
        System.out.println(st.isEmpty());


        // Comparing Arrays,Linked Lists and Stacks

        //   Get             T.C                      S.C
        /*
             Arrays           O(1)                     O(1)
            LinkedList        O(n)                     O(1)
            Stack             O(n)                     O(n)            
        */

    }
    
}
