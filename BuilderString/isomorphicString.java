package BuilderString;

import java.util.Scanner;

public class isomorphicString {
    public static void main(String[] args) {
        // leet code :- 205
    // Q). Given two strings s and t, determine if they are 
    // isomorphic.

    char[] a = new char[128];  //currently array have null character = '\0'
    //date - 12/07 time:-11:42
    Scanner scn = new Scanner(System.in);
    System.out.print("String s :");
    String s = scn.nextLine();
    System.out.print("String t :");
    String t = scn.nextLine();
    int m = 0;
    if(s.length()!=t.length()){
        System.out.println("false");
    }
    else{
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            if(a[ch]== '\0' || a[ch]==dh){
            a[ch] = t.charAt(i);}
            else{
                m++;
            }

        }
    }
    for(int i =0;i<a.length;i++){
        a[i]='\0';
    }
    if(s.length()!=t.length()){
        System.out.println("false");
    }
    else{
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            if(a[dh]== '\0' || a[dh]==ch){
            a[dh] = s.charAt(i);}
            else{
                m++;
            }

        }
    }

    if(m==0){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    scn.close();
    
    }



        
    }
    

