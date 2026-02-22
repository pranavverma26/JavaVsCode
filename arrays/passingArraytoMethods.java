package arrays;

public class passingArraytoMethods {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
    public static int change(int x){
        x = 10;
        return x;
    }
    
}
