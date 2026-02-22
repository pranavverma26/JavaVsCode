package BinarySearchTree;
class Node{
    Node left;
    Node right;
    int val;
    Node(int val ){
        this.val=val;

    }
}

public class MinMax1 {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(15);
        Node d = new Node(2);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(19);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;

        // Q). Find the minimum and maximum elements in a given B.S.T
        Node temp=a;
        while(a.left != null){
            a=a.left;
        }
        System.out.println("Minimum no = "+a.val);
        a=temp;
        while(temp.right != null){
            temp=temp.right;
        }
        System.out.println("Maximum no = "+temp.val);
    }
    
    
}
