package LinkedList;

//import java.lang.classfile.components.ClassPrinter.ListNode;

class Node{
    int value;
    Node next;

    // Node next = new Node(); so here Node next is refrence  variable and if we do
    // a.next = b, means next is referencing to b. and a is object which has two parameter one is value and another is Node next 

    Node(int value){
        this.value=value;
    }
}

/*
    
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 
class Solution {
    public void deleteNode(ListNode node) {  // here ListNode is refernce variable.

        node.val = node.next.val;
        node.next = node.next.next;

        
    }
}


 */
public class Basic1 {
    private static void reverse(Node idx){
        if(idx == null) return;
        reverse(idx.next);
        System.out.print(idx.value+" ");
    }
    public static void main(String[] args) {
        
        Node a = new Node(10);  // head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40); 
        Node e = new Node(50);

        System.out.println(a);  // LinkedList.Node@372f7a8d

        System.out.println(b);  // LinkedList.Node@2f92e0f4

        System.out.println(a.value); // 10
        System.out.println(b.value); // 20

        System.out.println(a.next); //  By default it is null.
        System.out.println(b.next);
        
        // linking each other

        a.next =b; // 10->20
        b.next=c;  // 10->20->30
        c.next=d;  // 10->20->30->40
        d.next=e;  // 10->20->30->40->50

        System.out.println(a.value);  // 10
        System.out.println(b.value); // now both will print same = 20
        System.out.println(a.next.value);  // 20

        System.out.println();

        System.out.println(a.value);
        System.out.println(a.next.value);
        System.out.println(a.next.next.value);
        System.out.println(a.next.next.next.value);
        System.out.println(a.next.next.next.next.value);

        // Q1.
        Node idx=a;
        reverse(idx);

        // Q2. 
        int len=0;
        while(idx!=null){
            len++;
            idx=idx.next;
        }
        if(len%2==0){
            
        }


    }
    
}
