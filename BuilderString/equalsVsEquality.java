package BuilderString;

public class equalsVsEquality {
    public static void main(String[] args) {
        
        /*  equals() vs ==
        a==b (==) it is used for comparison and it give o/p
        in true or false.
        a=b it is a asiignment operator in this, a has now
        the value of b.

        In java for strings for comparison we use equals()
        but not ==.
        */ 
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String c = "abc";
        c = c + "xyz";
        System.out.println(s);
        System.out.println(c);
        System.out.println(s==a); // true
        System.out.println(s==b); // false // in both case b and c new strings will form.
        System.out.println(s.equals(b)); // true it compares charcter by character
        System.out.println(s==c); // when we use == operator it
        // will give o/p false which is wrong.
        // In string equality operator (==) compares address.
        
    }
    
}
