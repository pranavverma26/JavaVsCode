package BinaryTree;
import java.util.Queue;
//import java.util.Scanner;
import java.util.LinkedList;
//import java.util.Scanner;
public class Traversals {
    static int n;
    static class Pair{
        Node node;
        int level;
        Pair(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }
       private static void preorder(Node dir){
        if(dir==null) return;
        System.out.print(dir.val+" ");
        preorder(dir.left);
        preorder(dir.right);
    }
       private static void inorder(Node dir){
        if(dir==null) return;
        inorder(dir.left);
        System.out.print(dir.val+" ");
        inorder(dir.right);
    }
       private static void postorder(Node dir){
        if(dir==null) return;
        postorder(dir.left);
        postorder(dir.right);
        System.out.print(dir.val+" ");
    }
    //         1
    //       /   \
    //      2     3
    //     / \   / \
    //    4   5 6   7
    //       /     \
    //      8       9

   private static void levelOrder(Node root){
        int a=0;
        Queue<Pair> q = new LinkedList<>();
        if(root !=null) q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front = q.remove();
            Node node = front.node;
            int lvl = front.level;
            if(a!=lvl){
                System.out.println();
                a++;
            }
            System.out.print(node.val+" ");
            if(node.left!=null)q.add(new Pair(node.left,lvl+1));
            if(node.right!=null)q.add(new Pair(node.right,lvl +1));
        }
    }
    private static void printLevel(Node root,int s){
        if(root == null) return;
        if(s==n) System.out.print(root.val+" ");
        printLevel(root.left,s+1);
        printLevel(root.right,s+1);
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Node a = new Node(1); // a is the  root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
      
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        e.left=h;f.right=i;
//             a(1)
//            /    \
//        b(2)      c(3)
//       /   \      /   \
//    d(4)  e(5)  f(6)  g(7)
        System.out.print("Preorder : ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder : ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder : ");
        postorder(a);
        System.out.println();
        System.out.print("LevelOrder1 : ");
        levelOrder(a);
        System.out.println();
        // System.out.print("Enter n : ");
        // n=sc.nextInt();
        System.out.print("LevelOrder2 : ");
        for(int x=0;x<4;x++){
            n=x;
        printLevel(a,0);
        }
    }
    
}
