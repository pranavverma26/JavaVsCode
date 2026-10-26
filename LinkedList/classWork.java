package LinkedList;
import java.util.*;
class LinkedList{
    int val;
    LinkedList next;

    LinkedList(int val){
        this.val=val;
    }
}
public class classWork {

    static void Print(LinkedList head){
        while(head!= null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
        return;
    }

    static LinkedList reverse(LinkedList head){
        LinkedList prev = null;
        LinkedList curr = head;

        while(curr != null){
            LinkedList nextNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;

        }
        return prev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList head= null;

        LinkedList temp1 = head;
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            LinkedList temp = new LinkedList(val);

            if(i==0){
                head=temp;
                temp1=head;

            }
            else{
                temp1.next=temp;
                temp1=temp;
            }
        }

        Print(head);

        // count number of nodes

        temp1=head;
        int count=0;
        while(temp1!=null){
            temp1=temp1.next;
            count++;
        }

        System.out.printf("No of nodes = %d",count);

        // middle of the node
        LinkedList fast = head;
        LinkedList slow = head;

        while(fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println();
        System.out.printf("Middle of the node is %d",slow.val);

        System.out.println();

        // cycle exist in a list

        fast=head;
        slow=head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast) System.out.print("Cycle present");
        }

        System.out.println("Cycle not present");

        LinkedList rev = reverse(head);

        Print(rev);



    }
    
}
