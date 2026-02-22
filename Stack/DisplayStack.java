package Stack;
import java.util.Stack;
public class DisplayStack {
    public static void main(String[] args) {
    Stack<Integer> st_original = new Stack<>();
    st_original.push(1);
    st_original.push(10);
    st_original.push(15);
    st_original.push(20);

    // while(!st_original.isEmpty()){
    //     System.out.println(st_original.pop());
    // }
    System.out.println(st_original);

    }
        
    
}
