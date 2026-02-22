package strings;

public class containsAndStartsWith {
    public static void main(String[] args) {
        String s = "Pranav";
        // The method contains and startsWith give output in 
        // true and false

        System.out.println(s.contains("anav")); // true string shoud be continus.
        System.out.println(s.startsWith("Pran")); // true
        System.out.println(s.startsWith("ran")); // false
        // endsWith
        System.out.println(s.endsWith("av")); // true
        System.out.println(s.endsWith("a"));
    }
    
}
