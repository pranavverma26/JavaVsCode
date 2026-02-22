package Stack;
import java.util.Stack;
import java.util.Scanner;
public class ElementAtBottom5 {
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        Stack<Integer> st_temp = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter idx: ");
        int idx = sc.nextInt();
        System.out.print("Enter ele: ");
        int ele = sc.nextInt();
        st_original.push(1);
        st_original.push(10);
        st_original.push(15);
        st_original.push(20);
        System.out.println(st_original);
        while(st_original.size()>=idx){
            st_temp.push(st_original.pop());
        }
        st_original.push(ele);
        while(!st_temp.isEmpty()){
            st_original.push(st_temp.pop());
        }
        System.out.println(st_original);
        sc.close();

        
        
    }

    
}
