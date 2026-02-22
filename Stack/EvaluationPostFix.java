package Stack;
import java.util.Stack;
public class EvaluationPostFix {
    public static void main(String[] args) {
        String s = "78+32-*";
        Stack<Integer> val = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int n = (int)ch;
            if(n>=48 && n<=57){
                val.push(n-48);
            }
            else{
                if(ch=='*' || ch=='/' || ch=='+' || ch=='-'){
                    int val1 = val.pop();
                    int val2 = val.pop();
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
