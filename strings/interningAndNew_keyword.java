package strings;

public class interningAndNew_keyword {
    public static void main(String[] args) {
        // In java strings are immutable.
        String s = "Raghav";
        String q = "Raghav";
        System.out.println(s);
        // Raghav -> Madhav
        // s.charAt(0) = "M";
        // s.charAt(2)="d";  This will give error because
        // we can't change string individual characters.
        s = "Madhav"; // now it will give by printing s as Madhav.
        System.out.println(s);
        // some pics on phone date 5/07/25 time : 1:19am
        // and 12:32pm
        // interning ki jati hai to save space.
        // new keyword :- it creates new thing.
        String a = new String("Raghav");
        System.out.println(a);
        System.out.println(q);

    }
    
}
