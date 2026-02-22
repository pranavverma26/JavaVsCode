package BuilderString;

public class append {
    public static void main(String[] args) {
        // append() 
        StringBuilder x  = new StringBuilder("abc");
        System.out.println(x);
        x.append(35);
        System.out.println(x);
        x.append("*");
        System.out.println(x);
        x.append("xyz");
        System.out.println(x);
        char[] ch = {'r','a','g'};
        x.append(ch);
        System.out.println(x);
        int[] arr = {1,2,3,4,5};
        x.append(arr); // does not work, address is appended.
        System.out.println(x);
        StringBuilder s  = new StringBuilder("pqr");
        x.append(s);
        System.out.println(x);
        // x+="lmn" this will not happen in string builder this will
        // happen in string.
    }
    
}
