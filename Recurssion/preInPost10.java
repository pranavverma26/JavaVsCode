package Recurssion;
public class preInPost10 {
    public static void pip(int n){
        if(n==0) return;
        System.out.print(n);
        pip(n-1);
        System.out.print(n);
        pip(n-1);
        System.out.print(n);
    }
    public static void main(String[] args) {

        // print zig-zag

        pip(1);  // 111
        System.out.println();
        pip(2);  // 211121112
        System.out.println();
        pip(3); // 321112111232111211123
        System.out.println();
        pip(4); // 432111211123211121112343211121112321112111234

        // Time complexity = O(2^n)
        
    }
    
}
