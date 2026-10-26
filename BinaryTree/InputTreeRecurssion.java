package BinaryTree;
import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class InputTreeRecurssion {
    private static Node constructTree(){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        Node root = new Node(val);
        root.left=constructTree();
        root.right=constructTree();
        return root;
    }
    public static void main(String args[]){

        Node root = constructTree();
        
    }
    
}
