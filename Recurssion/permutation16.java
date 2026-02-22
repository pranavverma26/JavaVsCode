package Recurssion;
public class permutation16 {
    public static void stringPermutation(String ans, String s){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i =0;i<s.length();i++){
            char p = s.charAt(i);
            String left =s.substring(0, i);
            String right = s.substring(i+1);
            // s.deleteCharAt(i);
            stringPermutation(ans+p,left+right);
            
        }
    }
    public static void main(String[] args) {
        
        // Q). Find all permutation of an string given all elements of the string are unique.
        String s = "abc";
        String p = "";
        stringPermutation(p,s);

        // Total number of calls = n(n-1)(n-2).... = n!
        // so Time complexity = O(n!)



    }
    
}
