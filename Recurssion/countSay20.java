package Recurssion;
import java.util.Scanner;
public class countSay20 {
    public static String count(int n){
        if(n==1) return "1";
        String s = count(n-1);
        String ans = "";
        int i =0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int len = j-i;
                ans+=len;
                ans+=s.charAt(i);
                i=j;
            }
        }

        // We can remove this below lines if we add any character on count(n-1). 


        int len = j-i;
        ans+=len;
        ans+=s.charAt(i);
        return ans;


    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int  n = scn.nextInt();
        System.out.println(count(n));
        scn.close();
        
    }
    
}
