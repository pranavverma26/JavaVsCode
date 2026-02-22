package Stack;
import java.util.Stack;
public class NextGreaterEle9 {
    public static void main(String[] args) {
    int[] arr={1,3,2,1,8,6,3,4};
    int n = arr.length;
    int[] ans = new int[n];
    ans[n-1] = -1;
    Stack<Integer> st = new Stack<>();
    st.push(arr[n-1]);
    for(int i=n-2;i>=0;i--){
    while(!st.isEmpty() && st.peek()<=arr[i]){
        st.pop();
    }
    ans[i] = st.isEmpty() ? -1 : st.peek();
    st.push(arr[i]);
    }
    for(int ele : ans){
        System.out.print(ele+" ");
    }
    
}
}
