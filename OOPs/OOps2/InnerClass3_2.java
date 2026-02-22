package OOPs.OOps2;

/*
The keyword static has a different meaning when applied to:

Variables / methods

Nested classes

🔹 Case 1: Static variable

When you write:

static String name;


This name belongs to the class, not to objects.

All objects share the same variable.

If one object changes it → it changes for everyone.

That’s why in your commented code:

class Test {
    static String name;
    Test(String name) {
        Test.name = name;
    }
}


If you do:

Test a = new Test("Kunal");
Test b = new Test("Rahul");

System.out.println(a.name); // Rahul
System.out.println(b.name); // Rahul


Both print Rahul, because name is static → shared.

🔹 Case 2: Static nested class

Now in your working code:

static class Test {
    String name;
    Test(String name) {
        this.name = name;
    }
}


Here, Test is a static nested class, not a static variable.

Making a class static means: it doesn’t depend on the object of the outer class (InnerClass3_2).

It’s like moving Test outside, but still keeping it inside for grouping.

Its fields (String name) are not static by default → so each Test object gets its own copy of name.
Test a = new Test("Kunal");  // a.name = "Kunal"
Test b = new Test("Rahul");  // b.name = "Rahul"

System.out.println(a.name); // Kunal
System.out.println(b.name); // Rahul

 */


//class Test{
//     static String name;
//     public Test(String name){
//         Test.name=name;
//     }
// }

// outside classes or the class that is not inside any other class can not be static.
public class InnerClass3_2 { // InnerClass3_2 also depends on obj bcz it is also not static.
    // In this case class Test depend on outer class bcz it is not static.
    // class Test{
    //     String name;
    //     public Test(String name){
    //         this.name =name;
    //     }
    static class Test{ 
        String name;
        public Test(String name){
            this.name = name;
        }

    }

    // }
    public static void main(String[] args) {

        // if we write the class Test outside the outer class then it will not give any error bcz then it is
        // not depend on any class.Then sout(a.name) and b.name will print same = rahul.
        Test a = new Test("kunal");
        Test b = new Test("Rahul");
        //But if we put class Test inside the outer class but start with static then it will not give any error.
        // then output is kunal and rahul
        // But there one doubt occur static is not dependent on obj then how are these two output are differents.
        System.out.println(a.name);
        System.out.println(b.name);
        
    }

    
}
