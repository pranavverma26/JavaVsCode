package Stack;
import java.util.Stack;
public class PostFixToInfix {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int n = (int)ch;
            if(n>=48 && n<=57){
                String q = ""+ch;
                val.push(q);
            }
            else{
                 if(ch=='*' || ch=='/' || ch=='+' || ch=='-'){
                    String val1 = val.pop();
                    String val2 = val.pop();
                    char x=ch;
                    String p = "("+val2+x+val1+")";
                    val.push(p);
                }
            }
        }
        System.out.println(val.peek());
    }
    
}
