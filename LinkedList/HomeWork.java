package LinkedList;

class HomeWork{
    public static void main(String[] args) {
      SLL list2 = new SLL();
      list2.insertAtEnd(10);
      list2.insertAtEnd(20);
      list2.insertAtEnd(30);
      list2.insertAtEnd(40);
      list2.insertAtEnd(50);
      //list2.insertAtEnd(60);
      // list2.insertAtEnd(70);
      // list2.insertAtEnd(80);
      list2.display();

      Node fast = list2.getHead();
      Node slow = list2.getHead();

      while(fast.next != null && fast.next.next != null){
        slow= slow.next;
        fast=fast.next.next;
      }
      System.out.println(slow.value);

    }
}
