package Stack;
import java.util.Stack;
public class InfixExpression {
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String s = "9-(5+3)*4/6";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int n = (int)ch;
            if(n>=48 && n<=57){
                val.push(n-48);
            }
            else if(op.size()==0 || ch == '(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek() != '('){
                    int val1=val.pop();
                    int val2=val.pop();
                    if(op.peek()=='+') val.push(val2+val1);
                    if(op.peek()=='-') val.push(val2-val1);
                    if(op.peek()=='*') val.push(val2*val1);
                    if(op.peek()=='/') val.push(val2/val1);
                    op.pop();

                }
                op.pop();

            }
            else{
                if(ch=='+' || ch=='-'){
                    int val1=val.pop();
                    int val2=val.pop();
                    if(op.peek()=='+') val.push(val2+val1);
                    if(op.peek()=='-') val.push(val2-val1);
                    if(op.peek()=='*') val.push(val2*val1);
                    if(op.peek()=='/') val.push(val2/val1);
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        int val1=val.pop();
                        int val2=val.pop();
                        if(op.peek()=='*') val.push(val2*val1);
                        if(op.peek()=='/') val.push(val2/val1);
                        op.pop();
                        op.push(ch);
                        }
                    else op.push(ch);

                }
            }
        }
        while(val.size()>1){
            int val1=val.pop();
            int val2=val.pop();
            if(op.peek()=='+') val.push(val2+val1);
            if(op.peek()=='-') val.push(val2-val1);
            if(op.peek()=='*') val.push(val2*val1);
            if(op.peek()=='/') val.push(val2/val1);
            op.pop();
        }
        System.out.println(val.peek());
    }
    
}
