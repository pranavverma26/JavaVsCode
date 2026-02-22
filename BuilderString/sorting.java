package BuilderString;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "pranav";
        char[] p = s.toCharArray();
        for(char ele:p){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(p);
        for(char ele:p){
            System.out.print(ele);
        }
        StringBuilder x = new StringBuilder();
        // to sort the stringbuilder
        char[] l = x.toString().toCharArray();
        Arrays.sort(l);
        
    }
    
}
