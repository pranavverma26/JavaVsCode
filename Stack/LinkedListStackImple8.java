package Stack;
class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){ 
        this.val=val;
    }
    Node(int val,Node next){
        this.val= val;
        this.next=next;
    }
}
class Stack{
    Node ll;
    Node temp1;
    Stack(){
        ll=null;
        temp1=null;
    }
    void push(int x){
        if(ll==null){ 
            ll = new Node(x);
        }
        else{
            temp1 = new Node(x);
            temp1.next=ll;
        }
    }
    int pop(){
        if(ll==null){ 
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int top = temp1.val;
            temp1=temp1.next;
            temp1.next=null;
            return top;
        }

    }
    int size(){
        int size=0;
        Node temp2=temp1;
        while(temp1!=null){
            temp1=temp1.next;
            size++;
        }
        temp1=temp2;
        return size;
    }
    boolean isEmpty(){
        if(ll==null) return true;
        else return false;
    }
    int peek(){
        return temp1.val;
    }
    void display(){
        Node temp2 = temp1;
        if(temp1==null) System.out.println("Empty");
        displayrev(temp2);
    }
    void displayrev(Node temp1){
        if(temp1 == null){
           // System.out.println("Stack is empty");
            return;
        }
        displayrev(temp1.next);            
        System.out.print(temp1.val+" ");
        }
}

public class LinkedListStackImple8 {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.display();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
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
        System.out.println(st.isEmpty());

    }

    
}
