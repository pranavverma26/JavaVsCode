package BuilderString;

import java.util.Scanner;

public class characterMostOccurring {
    public static void main(String[] args) {
    // Q). Given a string consisting of lowercase
    // English alphabets. Print the character that is occurring
    // most number of times.
    /*String s = "abaaacrmnrra";
    int n = 0;
    StringBuilder m = new StringBuilder(" ");
    for(int i =0;i<s.length();i++){
        char p = s.charAt(i);
        int l =0;
        for(int j =0;j<s.length();j++){
            char x = s.charAt(j);
            if(p==x){
                l++;

            }
        }
        if(l>n){
            n=l;
            m.setCharAt(0,s.charAt(i));
        }

    }
    System.out.println(m); */ // This method is not good.

    // Another best method to solve this problem.
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter String :");
    String s = scn.nextLine();
    int[] arr = new int[26];
    for(int i =0;i<s.length();i++){
        int p = s.charAt(i);
        arr[p-97]+=1;
    }
    int mx =0;
    for(int i =0;i<arr.length;i++){
        if(arr[i]>mx){
            mx = arr[i];
        }
    }
    for(int i = 0;i<arr.length;i++){
        if(arr[i]==mx){
            char ch = (char)(i+97);
            System.out.print(ch+" ");
        }
    }
    scn.close();




    }
    
}
