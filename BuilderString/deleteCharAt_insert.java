package BuilderString;

public class deleteCharAt_insert {
    public static void main(String[] args) {
        // deleteCharAt() :- you give idx, that 
        //particular character is removed from the string.
        StringBuilder x  = new StringBuilder("abcdef");
        System.out.println(x);
        x.deleteCharAt(3);
        System.out.println(x);
        System.out.println(x.charAt(3));
        // delete in range 
        x.append("xyz");
        System.out.println(x); //abcefxyz
        // let we have to delete cefx 
        x.delete(2, 6); // to delete characters from 2 to 5
        System.out.println(x); //abyz

        // insert it did not delete like set .
        // we can inser a char,int,string at a particular index
        // and shifts the rest of elements.
        x.insert(2,'g');
        System.out.println(x);

    }
    
}
