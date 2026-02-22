package strings;

public class toLowerCase_concat {
    public static void main(String[] args) {
        String s = "Pranav is 19 years old";
        // toLowerCase
        System.out.println(s.toLowerCase()); // it will change for only once
        String p = s.toLowerCase();
        // or s = s.toLowerCase(); // it will change permanently
        // s.toLowerCase()  Here nothing will happen.
        System.out.println(p); 

        //toUpperCase() it will make all char in capital form.

        // concat()

        String a = "abc";
        String b = "xyz";
        // a.concat(b); it will do nothing.
        System.out.println(a.concat(b)); // it will do for once.
        a = a.concat(b); // it will change permanently.

        System.out.println(a);


    }
    
}
