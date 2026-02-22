package strings;

public class substring {
    public static void main(String[] args) {
        String s= "abcde";
        // substring = string ka koi bhi continus part kitni bhi length ka.

        // substrings of s are = "a","ab","abc","abcd" 
        // above are subtstrings of s statring from a.
        // reverse are not substrings means cb are not subtring of s
        // ac is also not substring of s.
        // empty string is also substring of s.
       // String p = ""; // empty string and its length is 0.

        System.out.println(s.substring(2)); // it will print from index 2
        // so it will printn de
        System.out.println(s.substring(1,4)); // it will not include the end index.
        System.out.println(s.substring(2,2)); // it will not print anything.

    
        
    }
    
}
