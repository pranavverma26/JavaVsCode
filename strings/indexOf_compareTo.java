package strings;

public class indexOf_compareTo {
    public static void main(String[] args) {
        // indexOf():- let we have a string = "Raghav Garg"
        // Then if we have to know the index of 'r' the we use indexOf()
        // it will give the output for first appearance.
        String s = "Pranav Verma";
        System.out.println(s.indexOf('r'));
        // if the character not present in string then it will give the output -1.

        // Another method is lastIndexOf :- it will give index of the last.
        System.out.println(s.lastIndexOf('r'));
        // compare to
        String a = "abc";
        String b = "dbc";
        System.out.println(a.compareTo(b)); // diff of a-d = 97-100=-3
        // first of all comparison krega or suru k same hai but length jyada hai toa
        // jtna jyada hai woa answer aa jeyga.
        String c = "abcddee";
        String d = "abc";
        System.out.println(c.compareTo(d));
        


    }
    
}
