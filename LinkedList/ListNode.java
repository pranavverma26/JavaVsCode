package LinkedList;
public class ListNode {
     int val;
    ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     public static void main(String[] args) {
        ListNode l2 = new ListNode(1);        
        ListNode l3 = new ListNode(2);        
        ListNode l4 = new ListNode(3);        
        ListNode l5 = new ListNode(4);        
        ListNode l6 = new ListNode(5); 

       
        
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = null;
       //  ListNode head = l2;
        ListNode s = l2;
        while(s != null){
            System.out.print(s.val+" ");
            s=s.next;
        }

        ListNode temp2 = l2;
        ListNode temp = l2;
        ListNode fast = l2;
        ListNode slow = l2.next;
        ListNode slow2 = l2.next;
        while(temp2 != null){
            fast.next = temp2;
            fast = fast.next;
            temp2 = temp2.next;

            slow.next = temp2;
            slow = slow.next;
            temp2 = temp2.next;
        }
        if(fast.next == null){
            slow.next = null;
            fast.next = slow2;
        }
        else{
            fast.next = slow2;
        }
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }


     }
 }

