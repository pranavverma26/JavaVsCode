package strings;

public class plusOperator {
    public static void main(String[] args) {
        // String + int/char/string
        String s = "abc";
        String t = "lmn";
        s = s.concat("XYZ");// in concat we can't add numbers.
        System.out.println(s);
        s = s + "pst"+10; // we can't do this in concat.
        s+=t; // we can also do this.
        System.out.println(s);
        System.out.println(s);
        System.out.println("abc"+10+20); // o/p = abc1020
        System.out.println(10+20+"abc"); // here o/p = 30abc
        // this is due to hirerachy of operator, we go left to right so here we get two integers so we add it.
        

    }
    
}
