package BuilderString;

import java.util.Scanner;

public class reverseEachWordInSentence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String :");
        StringBuilder sb = new StringBuilder(scn.nextLine());
        int n = sb.length();
        int i =0; int j = 0;
        while(j<n){
            if(sb.charAt(j)!= ' ') j++;
            else{
                reverse(sb, i, j-1);
                i = j+1;
                j = i;
            }
        }
        reverse(sb, i, j-1); // for last word reverse because in last there is no space and due to n loop ends.
        System.out.println(sb);
        scn.close();

        
    }
    public static void reverse(StringBuilder sb,int i,int j){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;j--;
        }
    }
    // solve if more than one spaces is present between the words.
}
