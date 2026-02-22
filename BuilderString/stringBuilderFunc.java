package BuilderString;

public class stringBuilderFunc {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("pranav");
        System.out.println(sb.length());
        StringBuilder x  = new StringBuilder("madhav");
        System.out.println(sb.compareTo(x));
        // we can also use indexOf and lastIndexOf

        // reverse()
        System.out.println(sb.reverse());

        
    }
    
}
