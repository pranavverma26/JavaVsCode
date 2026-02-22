package OOPs.OOPs1;
public class wrapperClass1_1 {
    public static void main(String[] args) {

        // Defination:- A Wrapper Class in Java is a class that converts (wraps) a primitive 
        //data type into an object so that it can be used in the object-oriented features of Java (like Collections, Generics, etc.).

        // Wrapper classes convert primitives into objects.

        // Needed for collections, type conversion, and utility methods.

        // Integer is not an object itself.

        // Integer is a class (the wrapper class for int)

//         int a = 10;                  // primitive
// Integer obj1 = new Integer(a);  // ✅ object (explicit constructor, old way)
// Integer obj2 = Integer.valueOf(a); // ✅ object (preferred way)
// Integer obj3 = a;                // ✅ object (autoboxing)

// Integer → the class.

// obj1, obj2, obj3 → objects of Integer class.

// | Primitive | Wrapper Class |
// | --------- | ------------- |
// | `byte`    | `Byte`        |
// | `short`   | `Short`       |
// | `int`     | `Integer`     |
// | `long`    | `Long`        |
// | `float`   | `Float`       |
// | `double`  | `Double`      |
// | `char`    | `Character`   |
// | `boolean` | `Boolean`     |




        int a= 10;
        int b= 20;
        
        Integer num = 45;
        System.out.println(num);
        swap(a,b);// it will not swap because java is pass by value.
        // But as we know when we pass obj the refernce value will pass.
        // As we seen previous when we print the obj random values will print.
        System.out.println(a+" "+b);


        // final keyword:-
        // Final is a keyword and using that keyword you can basically prevent
        // for your content to be modified.
        // final variable should always be initialed while declaring it.

        final int Increase = 2; // now we can't modify the increase.
        System.out.println(Increase);

        //In final keyword.. we can't change the value is only holding true for primitive data types

        // final A pranav = new A();
        // In obj we can do A.name = "new name" here we can able to change the value of instance variable after using final keyword.
        // It only means we can't change the value when it is primitive data types but if it not primitive data type
        // then you can make change in the value but you can't reassign it.
        // like:-
        // A = other object

        final A kunal = new A("Kunal Kushwaha");
        kunal.name="Other name";
        // kunal.num=20; we can't change name bcz it is primitive data type;


        // when a non primitive is final, you cannot reassign it.
        // kunal = new A("new object");

       

        // If a is pointing to some object and then a is pointing to some other object then previous object
        // is removed by garbaje collector.

        //But sometimes when the object is destroyed with garbage collector.. you need to perform some 
        // short of action. To handle such situation java provides something known as finalization.
        // java does give you a way by performing some actions whenever your obj is being destroyed
        // In java you can't manually destroy the obj but we can manually do the task that when you decided to destroy(java itself do that) the
        // obj perfrom this task 

        // finalize method is called when java is doing garbage collection
        // means write before the obj is being freed from the memory java is going to called the garbage collector and finalize method

        //  A obj;

        // for(int i=0;i<1000000000;i++){
        //     obj = new A("Random name");

                           //Advantages of wrapper class.

// Wrapper classes come with useful methods.
// For example, Integer has methods like:

// parseInt("123") → convert String to int

// compare(10, 20) → compare two integers

// toString() → convert number to String

int s =12;
Integer.toString(s); // here we used wrapper class to convert int into string.

       
        int c = 5;                  // primitive
        Integer obj = Integer.valueOf(c); // wrap primitive into object

        System.out.println("Primitive: " + c); //here we not perform any task like a.
        System.out.println("Wrapper object: " + obj);// here on obj we perfrom many taska now by using obj.
        System.out.println();
    

       
        int x = 10;

        // Autoboxing: primitive → object
        Integer obj2 = x;

        // Unboxing: object → primitive
        int y = obj2;

        System.out.println("Autoboxed: " + obj2);
        System.out.println("Unboxed: " + y);

    }
    static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
    }
}
class A{
    final int num =10; // we can't change that value
    String name;

    A(String name){
        this.name = name;
    }
    // whenever the any obj of class A is freed from memory this method will be called.
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed.");
    }

}
