public class factorial {
    public static int fact(int a){
        int f =1;
        for(int i = a;i>0;i--){
            f *=i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 10 is = " + fact(10));
    }
    
}
