package Stack;
class Stack{
    private int[] arr = new int[5];
    private int idx = 0;
    void push(int x){
        if(idx==5){
            System.out.println("Stack is full");
            return;
        }
        arr[idx]=x;
        idx++;
        return;
    }
    int size(){
        return idx;
    }
    int peek(){
        if(idx==0){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[idx-1];
    }
    int pop(){
        if(idx==0){
            System.out.println("Stack is empty.");
            return -1;
        }
        int top = arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;
    }
    boolean isFull(){
        if(idx==5) return true;
        else return false;
    }
    boolean isEmpty(){
        if(idx==0) return true;
        else return false;
    }
    void display(){
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");;
        }
        System.out.println();
    }


}

public class ArrayStackImple7 {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.display();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println(st.isFull());
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st.size());
        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());

        
    }
    
}