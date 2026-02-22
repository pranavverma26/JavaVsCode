package BuilderString;

public class passingStringsToFunction {
    public static void main(String[] args) {
        // strings are pass by value in functions.
        String s = "Pranav";
        System.out.println(s);
        change(s);// no change here due to pass by value.
        System.out.println(s);
    }
    public static void change(String a){
        a = "Ashu";

    }
    
}
