package OOPs.OOPS5;

public interface A{

    // static interface method should always have a body. Because static methods are not inheritaed.
    // call via the interface name.
    static void  greeting(){
        System.out.println("Hey I am static method.");
    }

    // Use of default :-  The default is used to provide the means by which interfaces could be expanded without
    // breaking the existing code. For example :- You add another method without a body in an interface then you have
    // to provide the body of that method in all the classes that implement that interface.


    /*
     What is default in an interface?

Before Java 8, interfaces could only have abstract methods (no body).

That meant if you added a new method in an interface → all implementing classes broke, because they suddenly had to implement that new method.

👉 To solve this, Java 8 introduced default methods.

A default method is a method in an interface that has a body (implementation).

It is declared using the default keyword.

Classes that implement the interface inherit the default method automatically (they don’t need to override it, unless they want to).

🔹 Explanation of your lines

“The default is used to provide the means by which interfaces could be expanded without breaking the existing code.”

Means: You can add new methods to an interface using default without forcing all old implementing classes to change.

If you don’t use default, all existing classes will break (compile error) because they don’t implement the new method.
     */

     default void fun(){
        System.out.println("I am in A.");
     }
    
}
