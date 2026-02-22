package Recurssion;
import java.util.ArrayList;
public class subsetsString13 {
    static ArrayList<String> arr = new ArrayList<>();  // global
    public static void sub(int i,String s,String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
       sub(i+1,s,ans+(s.charAt(i)));
       sub(i+1,s,ans);

    }
    public static void main(String[] args) {
        String s = "abc";
        arr = new ArrayList<>(); // In leet code so many test cases will run so..we have to make a new arraylist each time to run all the test case.

        sub(0,s,"");
        System.out.println(arr);
        
    }
    
}
