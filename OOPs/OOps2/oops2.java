package OOPs.OOps2;

public class oops2 {
    public static void main(String[] args) {

        B obje = new B("Ashu");
        System.out.println(obje);

        // What are packages and why we are using packages ??
//  A package in Java is basically a folder (or namespace) that groups related classes, interfaces, and sub-packages together.

// Think of it like a folder in your computer where you keep similar files together to stay organized.

// Example:

// java.util → contains utility classes like ArrayList, HashMap, Date, etc.

// java.io → contains input/output classes like File, BufferedReader, etc.

// We use packages for several reasons:-
// 1. Organization:- Keeps related classes are in java.util
// 2. Avoid name Conflicts:- Two different programmers may write classes with the same name. Packages help
// distinguish them.
// 3.Code Reusability:- You can create your own package and reuse it in multiple projects.

// How we use and make packages in java :-

// Inside file MyPackageClass.java
// package mypackage;   // declaring package

// public class MyPackageClass {
//     public void display() {
//         System.out.println("Hello from MyPackage!");
//     }
// }

// Inside another file Main.java
// import mypackage.MyPackageClass;   // importing user-defined package

// public class Main {
//     public static void main(String[] args) {
//         MyPackageClass obj = new MyPackageClass();
//         obj.display();
//     }
// }



        
    }
    
}
class B{
    int num =10;
    String name;
    B(String name){
        this.name = name;
    }
}
