package BuilderString;

public class stringbuilder {
    public static void main(String[] args) {

     // StringBuilder declaration :-

        StringBuilder sb =  new StringBuilder("abc");
        System.out.println(sb);
        System.out.println(sb.length());

        // empty StringBuilder
        StringBuilder x  = new StringBuilder();
        System.out.println(x.length());
        StringBuilder a  = new StringBuilder("10"); // it is string of length 2
        StringBuilder b  = new StringBuilder(10); // here 10 is capacity
        // means 10 khali spcae reserve kr liya.
        // Length is a used capacity.
        System.out.println(b.length());
        System.out.println(a.length());
        String s = "pqr";
        StringBuilder l  = new StringBuilder(s);
        System.out.println(l);
        // we can also print the capacity.
        // by default empty StringBuilder have 16 capacity
        System.out.println(x.capacity()); // o/p = 16
        System.out.println(b.capacity());

        
    }
    
}
