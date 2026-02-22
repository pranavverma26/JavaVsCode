package Stack;
import java.util.Stack;
public class PrefixToPostFix {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        String s = "-9/*+5346";
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            int n = (int)ch;
            if(n>=48 && n<=57){
                String q = ""+ch;
                val.push(q);
            }
            else{
                if(ch=='*' || ch=='/' || ch=='+' || ch=='-'){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char x=ch;
                    String p = val2+val1+x;
                    val.push(p);
                }
            }
        }
        System.out.println(val.peek());
    }
    // HW :- post to pri
    // Hw :- prefix to infix
}
