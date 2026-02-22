package strings;

import java.util.Scanner;

public class counting_vowel {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.print("Enter string:");
        String str = scn.nextLine();
        int count = 0;
        String vowel = "AEIOUaeiou";

        for(int i = 0;i<str.length();i++){
            for(int j =0 ;j<vowel.length();j++){
                if(str.charAt(i)==vowel.charAt(j)){
                    count++;
                }
            }
            }
            System.out.print(count);
            scn.close();

        }

   }
    

