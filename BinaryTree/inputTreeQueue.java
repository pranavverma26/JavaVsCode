package BinaryTree;
import java.util.*;
class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class inputTreeQueue {
    private static int sumNodes(Node root,int sum){
        if(root == null) return sum;
        sum+=root.val;
        sum=sumNodes(root.left,sum);
        sum=sumNodes(root.right,sum);
        return sum;
    }

    private static int product(Node root, int pro){
        if(root == null) return pro;
        pro*=root.val;
        pro=product(root.left,pro);
        pro=product(root.right,pro);
        return pro;
    }
    private static int NonZeroProduct(Node root, int pro){
        if(root == null) return pro;
        if(root.val != 0) pro*=root.val;
        pro=NonZeroProduct(root.left,pro);
        pro=NonZeroProduct(root.right,pro);
        return pro;
    }
    private static Node constructTree(){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if(val==-1) return null;
        Node root = new Node(val);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.remove();

            val = sc.nextInt();

            // Left Child
            if(val != -1){
                curr.left=new Node(val);
                q.add(curr.left);
            }


            val = sc.nextInt();
            // right child
            if(val != -1){
                curr.right = new Node(val);
                q.add(curr.right);
            }
        }
        return root;
        
    }
    private static void Display(Node dir){
        if(dir==null) return;
        System.out.print(dir.val+" ");
        Display(dir.left);
        Display(dir.right);
    }
    public static void main(String args[]){

        Node root = constructTree();
        System.out.println("Print Tree");
        Display(root);
        System.out.printf("\nSum of Nodes : %d",sumNodes(root,0));
        System.out.printf("\nProduct of Nodes : %d",product(root,1));
        System.out.printf("\nProduct of non-zero Nodes : %d",NonZeroProduct(root,1));

        
    }
}
