package Stack;
import java.util.Stack;
public class ReverseStackRecursively6 {
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        reverse(st);
        System.out.println(top);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(1);
        st_original.push(2);
        st_original.push(3);
        st_original.push(4);
        System.out.println(st_original);
        reverse(st_original);
        System.out.println(st_original.isEmpty());
        
    }
    
}
