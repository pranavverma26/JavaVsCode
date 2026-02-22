package Recurssion;

public class skipAchar {
    public static void skip(int s,String a,String ans){
        if(s==a.length()){
            System.out.println(ans);
            return;
        }
        if(a.charAt(s)!='a'){
            ans += a.charAt(s);
        }
        skip(s+1,a,ans);
       }
    public static void main(String[] args) {
        // Q) Remove all occurence of 'a' from a string.
        String a = "Pranav";
        skip(0,a,"");
        // Time complexity = O(n)
    }
    
}
