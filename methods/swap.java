public class swap {
    public static void swaap(int a, int b) {
    int c;
    c = b;
    b = a;
    a = c;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
        
    }
    public static void main(String[] args) {
      swaap(5,3);
        
    }
    
}
