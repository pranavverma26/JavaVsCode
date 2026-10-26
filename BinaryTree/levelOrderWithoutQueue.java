package BinaryTree;
import java.util.Scanner;
import java.util.Stack;
public class levelOrderWithoutQueue {
    public static Node buildTree(String[] arr, int i) {
        // Base case: if index out of bounds or node is null indicator (-1)
        if (i >= arr.length || arr[i].equals("-1")) {
            return null;
        }

        // Create the current root node
        Node root = new Node(Integer.parseInt(arr[i]));

        // Insert left child (Formula: 2 * i + 1)
        root.left = buildTree(arr, 2 * i + 1);

        // Insert right child (Formula: 2 * i + 2)
        root.right = buildTree(arr, 2 * i + 2);

        return root;
    }

    public static void preorder(Node root){
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr = st.pop();
            System.out.print(curr.val+" ");
            if(curr.right != null)st.push(curr.right);
            if(curr.left != null)st.push(curr.left);
            
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // Example Input: "1 2 3 4 5 -1 -1"
        String[] input = sc.nextLine().split(" ");
        
        // Build the tree starting from index 0
        Node root = buildTree(input, 0);
        
        // Your tree is built! You can now traverse it.
        System.out.println("Tree Formed successfully.");
        preorder(root);



    }
    
}
