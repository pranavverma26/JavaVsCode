package BinaryTree;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class implementation1 {
    private static void Display(Node dir){
        if(dir==null) return;
        System.out.print(dir.val+" ");
        Display(dir.left);
        Display(dir.right);
    }
    private static int level(Node root){
        if(root==null) return 0;
        return 1+ Math.max(level(root.left),level(root.right));
    }
    private static int Sum(Node a){
        if(a==null) return 0;
        return a.val+Sum(a.left)+Sum(a.right);
    }
    private static int product(Node a){
        if(a==null) return 1;
        return a.val*product(a.left)*product(a.right);
    }
     private static int non(Node a){
        if(a==null) return 1;
        if(a.val==0) a.val=1;
        return a.val*non(a.left)*non(a.right);
    }
    //  private static int max(Node a,int t){
    //     if(a==null) return t;
    //     if(a.val>t) t=a.val;
    //     t=max(a.left,t);
    //     t= max(a.right,t);
    //     return t;
    // }
    private static int max(Node a){
        if(a==null) return Integer.MIN_VALUE;
        int s=a.val,b=max(a.left),c=max(a.right);
        return Math.max(s,Math.max(b,c));
    }
     private static int min(Node a){
        if(a==null) return Integer.MAX_VALUE;
        int s=a.val,b=min(a.left),c=min(a.right);
        return Math.min(s,Math.min(b,c));
    }
    //  private static int size(Node a,int s){
    //     if(a==null) return s;
    //     else s++;
    //     s=size(a.left,s);
    //     s=size(a.right,s);
    //     return s;
    // }
    private static int size(Node a){
        if(a==null) return 0;
        return 1+ size(a.left)+size(a.right);
    }

    public static void main(String[] args) {
        Node a = new Node(1); // a is the  root
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(-20);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.right=f;
        c.left=g;e.right=h;
        //     A
        //    / \
        //   B   C
        //       1
        //     /   \
        //   41     3
        //  /  \   / \
        // 2    6 10  5
        //       \
        //       20
        // System.out.println(a.left.val);
        // System.out.println(b.val);
        // System.out.println(e.val);
        // System.out.println(a.left.right.val);
        Display(a);
        System.out.println();
        System.out.println(Sum(a));
        System.out.println(product(a));
        // product of non-zero numbers
        System.out.println(non(a));
        System.out.println(max(a));
         System.out.println(min(a));
         System.out.println(size(a));
         System.out.println(level(a));
    //         1
    //       /   \
    //      2     3
    //     / \   / \
    //    4   5 6   7
    //             / \
    //            8   9

    }
    
}
