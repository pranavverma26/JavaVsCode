package Queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class ReverseQueueStack {
    public static void main(String[] args) {
        Queue<Integer> q1 =  new LinkedList<>();
        Stack<Integer> val = new Stack<>();
            q1.add(1);
            q1.add(2);
            q1.add(3);
            q1.add(4);
            q1.add(5);
            System.out.println(q1.peek());
            System.out.println(q1);
            while(!q1.isEmpty()){
                val.push(q1.remove());
            }
            System.out.println(val);
            while(!val.isEmpty()){
                q1.add(val.pop());
            }
            System.out.println(q1);

    }
    
}
