package LinkedList;
class SLL{  // user defined data structure.
    private Node head;
    private Node tail;
    private int size;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        // We have to do this code because when you first insert, the list has no 
        // nodes. So this line means head should point to this new node.
        // tail should also point to this same node (because it's only one.)
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail =  temp;
        }
        size++;
    }
    // Time complexity in case of insertAtEnd and insertAtHead is O(1)
    // and Space complexity is O(1) if tail is given.
    // if tail is not given then Time complexity is O(n).
     void insertAtHead(int val){
        Node temp =  new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next=head;
            head = temp;
        }
        size++;
    }

    // time complexity = O(n) and Space Complexity = O(1)
      void insert(int idx,int val){
        if(idx == 0) {
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtEnd(val);
            return;
        }
        if(idx>size){
            System.out.println("Invalid index!!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=0;i<idx-1;i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
      
    }
    void DelEle(int idx){
        if( idx ==0){
            head = head.next;
            size--;
            return;
        }
        if(idx>size || idx<0){
            System.out.println("Invalid Index!!");
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        if(idx==size-1) tail = temp;
        temp.next=temp.next.next;
        

    }

    void getElement(int idx){
        if(idx==0){
            System.out.println(head.value);
            return;
        }
        if(idx==size-1){
            System.out.println(tail.value);
            return;
        }
        if(idx>size || idx<0){
            System.out.println("Invalid Index!!");
            return;
        }
        Node temp = head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        System.out.printf("Index at %d = %d",idx,temp.next.value);
    }
    // Time complexity = O(n)
    // Space Complexity = O(1)
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    // time complexity if head and tail both is present = O(1)
    // time complexity if only head is present = O(n)
    void size(){
        System.out.println("Size :"+size);
    }
    Node getHead(){
        return head;
    }
}
public class implementationLL3 {
    public static void main(String[] args) {

        SLL list = new SLL();
        list.size();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.size();
        list.display();
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.size();
        list.display(); 
        list.insert(3, 35);
        list.display();  
        // list.getElement(11);
        // list.DelEle(2);
        // list.display();
    }
}
