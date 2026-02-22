package Stack;
import java.util.Stack;
public class PreviousGreaterEle {

    // arr[] = [100, 80, 90, 120]
    public static void main(String[] args) {
    int[] arr={10,4,2,20,40,12,30};
    int n = arr.length;
    int[] ans = new int[n];
    ans[0]=-1;
    Stack<Integer> st = new Stack<>();
    st.push(arr[0]);
    for(int i=1;i<n;i++){
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
