package BinarySearchTree;
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}
public class BinarySearchTreeInput {

    private static TreeNode construct(TreeNode root,int val){

        if(root==null) return new TreeNode(val);

        if(val<root.val) root.left=construct(root.left,val);
        if(val>root.val) root.right=construct(root.right,val);
        return root;

    }
    
    public static void main(String args[]){

        TreeNode root= null;

        while(true){
            Scanner sc = new Scanner(System.in);

            int val = sc.nextInt();

            if(val==-1) break;

            root = construct(root,val);
        }


    }
    
}
