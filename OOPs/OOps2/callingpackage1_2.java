package OOPs.OOps2;
import hello.package1;
public class callingpackage1_2 {
    int age;
    String name;
    int salary;
    boolean married;
    public static void main(String[] args) {
        package1 obje1 = new package1();
        //Here we had to import the package1 class bcz it is not present in the same package.
        obje1.display();

        // we do not had to import the Human3 class beacuse Human3 are in the same package.
        Human1_2 pranav = new Human1_2(22,"Pranav",1500000,false);
        Human1_2 kunal = new Human1_2(32,"Ashu",100000,true);
        callingpackage1_2 Shreya = new callingpackage1_2(11,"Shreya",100000000,false);

        System.out.println(pranav.name);
        System.out.println(kunal.married);
        

        // Q) What is static variable ??

         // What if there was some short of property which common to every single human beings ??
        // Answer is population which is common for all human being.
        // such property which is not directly relataed to the object but common to all the objects of that class those are known as static variable
        // method.
        // when a member is declared static it can be accessed before any of the object of the class is being created
        // and without refrencing to that object.

        // You can call a static method without creating an object of the class.

        // Q). In psvm why main is declared as static ?

// The JVM (Java Virtual Machine) needs to call main() without creating an object of the class.

// If main was not static, JVM would need to create an object first → but then it would need a starting point to create that object → which again requires main → infinite loop. ❌

// That’s why main() is static, so JVM can directly call


       
        System.out.println(Human1_2.population); // By using obj name population is accessible but according to
        // convention we have to use class name to accesses the static variable.

    // Inside a static method we cannot use anything that is not satic.
    //    greeting(); it will geve error
    fun1(pranav);// this will call greeting in Human3 class.
    fun2(Shreya); // this will call greeting in callingpackage1 class.


    }
   // This does not belongs to some instance.But we can write static method inside non-static method.
   static  void fun1(Human1_2 obj){
       // greeting();  // you can't use this becausse it requires an instance
        // but the function you are using it in does not depend on instance.

    // to use non-static method inside static method we have to do obj_name.method_name();
    obj.greeting();

// Why can’t fun() call greeting() directly?
// Because:
// fun() is static → it belongs to the class, not to any object.
// greeting() is non-static → it belongs to an object (instance).
// 👉 When you write just greeting(); inside fun(), Java asks:
// "Which object’s greeting() should I call? s1? s2? or some other object?"
// Since no object is mentioned, Java gets confused and throws an error.

/*
But wait — “greeting doesn’t have any instance variable”
Yes, you are right ✅ In your code, greeting() doesn’t use any instance variable.
But still → by definition, a non-static method is tied to an object, even if it doesn’t use any object data.
Even if the method body is simple, Java still follows the rule.
 */

    }
    static void fun2(callingpackage1_2 obj){
        obj.greeting();
    }

    // we know that something which is not static, belongs to an object.
    // This belongs to some instance because it is different for all objects.
    void greeting(){
        // Human3 obj1 = new Human3(12, "Prakash", 100000, false);
        // fun(obj1);
        System.out.println("Hello world");
    }
    callingpackage1_2(int age,String name,int salary,boolean married){
        this.age =age;
        this.name = name;
        this.salary=salary;
        this.married= married;

    }
    
}
