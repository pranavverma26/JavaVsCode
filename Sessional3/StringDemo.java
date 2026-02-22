package Sessional3;
public class StringDemo {
    static void demonstrateStringMethods(String s) {
        System.out.println("\n--- String Class Methods ---");
        System.out.println("Original String: " + s);
        System.out.println("Length: " + s.length());
        System.out.println("Character at index 2: " + s.charAt(2));
        System.out.println("Substring (2 to 6): " + s.substring(2, 6));
        System.out.println("Equals 'Hello': " + s.equals("Hello"));
        System.out.println("Replace 'Java' with 'World': " + s.replace("Java", "World"));
    }
    static void demonstrateStringBuffer() {
        System.out.println("\n--- StringBuffer Operations ---");
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Initial StringBuffer: " + sb);
        sb.append(" Java");
        System.out.println("After append(): " + sb);
        sb.insert(6, "Beautiful ");
        System.out.println("After insert(): " + sb);
        sb.reverse();
        System.out.println("After reverse(): " + sb);
        sb.reverse(); 
        sb.delete(5, 15);
        System.out.println("After delete(): " + sb);
    }
    static void demonstrateStringBuilder() {
        System.out.println("\n--- StringBuilder Operations ---");
        StringBuilder sb = new StringBuilder("Coding");
        System.out.println("Initial StringBuilder: " + sb);
        sb.append(" in Java");
        System.out.println("After append(): " + sb);
        sb.insert(7, "is Fun ");
        System.out.println("After insert(): " + sb);
        sb.delete(7, 14);
        System.out.println("After delete(): " + sb);
        sb.reverse();
        System.out.println("After reverse(): " + sb);
    }
    public static void main(String[] args) {
        System.out.println("--- Demonstration of String Immutability ---");
        String str = "Hello";
        System.out.println("Original String: " + str);
        String newStr = str.concat(" Java");
        System.out.println("After concatenation: " + newStr);
        System.out.println("Are both strings same object? " + (str == newStr));
        System.out.println("Original String after concat(): " + str);
        demonstrateStringMethods(newStr);
        demonstrateStringBuffer();
        demonstrateStringBuilder();
    }
}

