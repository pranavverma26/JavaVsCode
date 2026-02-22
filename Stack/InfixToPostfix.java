package Stack;
import java.util.Stack;
public class InfixToPostfix {
    public static void main(String[] args) {
        String s = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int n = (int)ch;
            if(n>=48 && n<=57){
                String q = ""+ch;
                val.push(q);
            }
            else if(op.size()==0 || ch == '(' || op.peek()=='(')  op.push(ch);
            else if(ch == ')'){
                while(op.peek() != '('){
                    String val2 = val.pop();
                    String val1 =val.pop();
                    char x = op.pop();
                    String t = val1+val2+x;
                    val.push(t);
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    String val2 = val.pop();
                    String val1 =val.pop();
                    char x = op.pop();
                    String t = val1+val2+x;
                    val.push(t);
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*' || ch =='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String val2 = val.pop();
                        String val1 =val.pop();
                        char x = op.pop();
                        String t = val1+val2+x;
                        val.push(t);
                        op.push(ch);
                    }
                    else op.push(ch);
                }

            }

        }
        while(val.size()>1){
            String val2 = val.pop();
            String val1 =val.pop();
            char x = op.pop();
            String t = val1+val2+x;
            val.push(t);

        }
        System.out.println(val.peek());
    }
    
}
