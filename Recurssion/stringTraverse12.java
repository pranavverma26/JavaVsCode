package Recurssion;

public class stringTraverse12 {
    public static void print(int s, String a){
        if(s==a.length()) return;
        System.out.print(a.charAt(s));
        print(s+1,a);
    }
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a.charAt(1));
        print(0,a);
    }
    
}
