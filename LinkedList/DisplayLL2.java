package LinkedList;
public class DisplayLL2 {

     public static void display(Node head){
       // Node temp=a;
        if(head == null){
            return;
        }
        System.out.println(head.value);
        display(head.next);            
        }

        public static void reverse(Node head){
       
        if(head == null){
            return;
        }
        reverse(head.next);            
        System.out.print(head.value+" ");
        }

        
        

    // Shallow copy of node(temp). It is used to traverse the LinkedList(ll)
    public static void main(String[] args) {
       
       // Node a = new Node(100);

        // Node temp = a; // shallow copy means if we make changes in temp or a both will change.

       // Node temp = new Node(100); // deep copy

        Node a = new Node(10);  // head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40); 
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next=d;
        d.next=e;

        /*  Print using loop..
         for(int i=1;i<5;i++){} or we do :-
        Node temp = a;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println();*/
        
        // Display ele using function..
        display(a);

        System.out.println();

        // Print elements in reverse order..
        reverse(a);

    }
    
}
