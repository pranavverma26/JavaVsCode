package Queue;
class ll{
    int val;
    ll next;

    ll(){}
    ll(int val){
        this.val=val;
    }
    ll(int val,ll next){
        this.val=val;
        this.next=next;
    }

}
class Queuel{
    ll head = null;
    ll dummy = new ll(-1);
    int size=0;
    void add(int x){
        if(head==null){
            ll temp = new ll(x);
            dummy.next = temp;
            dummy = dummy.next;
            head=temp;
            temp.next=null;
        } 
        else{
            ll temp=new ll(x);
            dummy.next=temp;
            dummy=dummy.next;
            temp.next=null;
        }
        size++;
    }
    int remove(){
        if(head==null){
            System.out.println("Queue is empty");
            return -1;
        }
        int x =head.val;
        head = head.next;
        size--;
        return x;

    }
    int peek(){
        return head.val;
    }
    boolean isEmpty(){
        if(head== null) return true;
        else return false;
    }
    void display(){
        if(head==null){
            System.out.println("Queue is Empty");
        }
        ll temp2=head;
        while(temp2!=null){
            System.out.print(temp2.val+" ");
            temp2=temp2.next;
        }
        System.out.println();
    }

}

public class LinkedListQueueImple {
    public static void main(String[] args) {
        Queuel q2 = new Queuel();
        System.out.println(q2.isEmpty());
        q2.add(1);
        q2.add(2);
        System.out.println("size="+q2.size);
        q2.display();
        q2.remove();
        q2.add(3);
        q2.display();
        q2.add(4);
        System.out.println("size="+q2.size);
        q2.add(5);
        q2.display();
        System.out.println(q2.isEmpty());
        System.out.println(q2.peek());

    }
    
}
