package BuilderString;

// import java.util.Scanner;

public class compressString {
    // leet code :- 443
    // Q). compress a given string.
     // ex :- S = "aaaabbcddeff"
     // ans = "a4b2cd2ef2"
     public static void main(String[] args) {
    //  int[] a = new int[26];
    //  Scanner scn = new Scanner(System.in);
    //  System.out.print("Enter String :");
    //  String s = scn.nextLine();
    //  for(int i =0;i<s.length();i++){
    //     int p = (int)s.charAt(i);
    //     a[p-97]+=1;
    //  }
    //  for(int i=0;i<a.length;i++){
    //     if(a[i]==1){
    //         System.out.print((char)(i+97));
    //     }
    //     else {
    //         if(a[i]>1){
    //             System.out.print(((char)(i+97))+""+a[i]);
    //         }
    //     }
    //  }
    //  scn.close();
    // Best method.
     String s = "aaaasaihaihh";
     char[] arr = s.toCharArray();
     String ans = "";
     int i=0,j=0;
     while(j<arr.length){
        if(arr[j]==arr[i]) j++;
        else{
            ans+=arr[i];
            int len = j-i;
            if(len>1) ans += len;
            i=j;
        }
     }
     ans += arr[i];
     int len = j-i;
     if(len>1) ans+=len;
     System.out.println(ans);



    
}
}