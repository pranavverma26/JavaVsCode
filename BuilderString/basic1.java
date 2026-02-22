package BuilderString;

public class basic1 {
    public static void main(String[] args) {
        // we can't change the individual characters in a string,
       // we can but we will waste lot of time and space.
       
       // modify character in string.

       String s = "Hello";
       // Q). 2nd index chage to y.
       s = s.substring(0,2) + "y" + s.substring(3);
       System.out.println(s); // it will take time and waste your space.
        String p = "a";
        System.out.println(p+1);
    }
    
}
