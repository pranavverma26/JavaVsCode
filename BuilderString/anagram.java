package BuilderString;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        // leet code :- 242
        // Given two strings s and t, return true if
        // t is an anagram of s, and false otherwise.

        // abc and bca are annagrams.annagrams means kisi word koa suffle kr k ak dusra word bnn rha hai toa woa word dusra ka 
        // anagram hai.
        
        String s = "pranav";
        String t = "avnapr";
        if(s.length()!=t.length()) System.out.println("false");
        else{
        char[] p = s.toCharArray();
        char[] q = t.toCharArray();
        Arrays.sort(p);Arrays.sort(q);
        int j =0;
        for(int i = 0;i<p.length;i++){
            if(p[i]!=q[i]) j++;
        }
        if(j>0) System.out.println("false");
        else System.out.println("true");    }

        
    }
    
}
