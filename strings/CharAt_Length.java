package strings;

public class CharAt_Length {
    public static void main(String[] args) {
        // charAt() :- to get character at some index
        // String s = "Pranav"
        // Let we have to print n from s then we don't do s[3] 
        // we use charAt
        String s = "Pranav Verma";
        System.out.println(s.charAt(3));
        // we also treat space as an character
        // so length():- s.length()
        // in array we write only s.length but in string we write s.length()
        System.out.print(s.length());
    }
    
}
