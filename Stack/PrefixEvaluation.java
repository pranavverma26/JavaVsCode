package Stack;
import java.util.Stack;
public class PrefixEvaluation {
    public static void main(String[] args) {
        String s = "*+32/84";
        Stack<Integer> val = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            int n = (int)ch;
            if(n>=48 && n<=57){
                val.push(n-48);
            }
            else{
                if(ch=='*' || ch=='/' || ch=='+' || ch=='-'){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if(ch=='+') val.push(val2+val1);
                    if(ch=='-') val.push(val2-val1);
                    if(ch=='*') val.push(val2*val1);
                    if(ch=='/') val.push(val2/val1);
                }
            }
        }
        System.out.println(val.peek());
    }
    
}
