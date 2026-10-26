package BinaryTree;
import java.util.*;
class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val){
        this.val=val;
    }
}
public class IterativeTraversal {

    public static TreeNode constructTree(){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if(val==-1) return null;

        TreeNode root = new TreeNode(val);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();

            // left child

            val = sc.nextInt();
            if(val != -1){
                curr.left=new TreeNode(val);
                q.add(curr.left);
            }

            // right child

            val = sc.nextInt();
            if(val != -1){
                curr.right= new TreeNode(val);
                q.add(curr.right);
            }
        }
        return root;
    }

    public static void preorder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            System.out.print(curr.val+" ");
            if(curr.right != null)st.push(curr.right);
            if(curr.left != null)st.push(curr.left);
            
        }
    }
    public static void inorder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        while(true){
            if(root != null){
                st.push(root);
                root=root.left;
            }
            else{
                if(st.isEmpty()) break;
                TreeNode top = st.pop();
                System.out.print(top.val+" ");
                root=top.right;
            }

        }
    }

    public static void postorder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        Stack<TreeNode> ans = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            ans.push(curr);
            if(curr.left != null)st.push(curr.left);
            if(curr.right != null)st.push(curr.right);
            
        }

        while(!ans.isEmpty()){
            System.out.print(ans.pop().val+" ");
        }

    }
    public static void main(String args[]){

        TreeNode root = constructTree();
        TreeNode temp = root;
        preorder(temp);
        
        temp=root;
        System.out.println("\nInoredr : ");
        inorder(temp);

        temp = root;
        System.out.println("\nPostorder");
        postorder(root);

    }
    
}
