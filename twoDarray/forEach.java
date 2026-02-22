package twoDarray;

public class forEach {
    public static void main(String[] args) {
    int[] a = {4,5,7,8};
    for(int ele : a){
        System.out.print(ele+" ");
    }
    System.out.println();
    int[][] b = {{1,2,3},{7,6,3}};
    for(int[] ele :b){
        for(int x : ele){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    
} 
}
