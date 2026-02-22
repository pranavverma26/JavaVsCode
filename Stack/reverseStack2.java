package Stack;

import java.util.Stack;

public class reverseStack2 {
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(1);
        st_original.push(10);
        st_original.push(15);
        st_original.push(20);
        System.out.println(st_original);
        Stack<Integer> st_reversed = new Stack<>();
        while(!st_original.isEmpty()){
            st_reversed.push(st_original.pop());
        }
        System.out.println(st_reversed);
    }
    
}
