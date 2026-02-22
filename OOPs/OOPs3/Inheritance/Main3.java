package OOPs.OOPs3.Inheritance;
public class Main3 {
    public static void main(String[] args) {
        inheritance1 box1 = new inheritance1(4.8,5.1,6.2);
        System.out.println(box1.getL());
        // Now question arises l is actually private then how would you 
        // print it outside class ?
        // Answer is we are not directly accessing it. I am accessing it via a method that is used inside that
        // class only. This particular thing of making stuff private like this this is known as data hiding.

        // Data hiding is foccussed on data security and Encapsulation focusses on hiding the complexity of the system.
        // data hiding is achived via encapsulation and encapsulation is the sub-process of data hiding.

        inheritance1 box2 = new inheritance1(box1);
        System.out.println(box1.h+" "+box1.w);
        System.out.println(box2.h+" "+box2.w);

        InheritanceWeight box3 = new InheritanceWeight();
        InheritanceWeight box4 = new InheritanceWeight(2,3,4,8);
        System.out.println(box3.h+" "+box3.weight);
        System.out.println(box4.h+" "+box4.weight);

        // the parent class object is not able to access the instance of child class but child class object
        // can acess the partent class object.

        //inheritance1 box5 = new InheritanceWeight(2,3,4,5);
        // After doing this also..parent class can't get the access of child class instance.
        // This is happening bcz it is actually the type of the refrence var not the type of the obj that determines
        // what members can be accessed.


       //System.out.println(box5.w+" "+box5.weight);
        

       // inheritanceWeight2 box6 = new inheritance1(2,3,4);
        // Here error will occur bcz there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        //this is why error.

        //               
        
                                        // Single Inheritance
            InheritancePrice box6 = new InheritancePrice();
            System.out.println(box6.w); // Here it will call default super() constructor.

            InheritancePrice cube = new InheritancePrice(51,60,66);
            System.out.println(cube.w+" "+cube.weight+" "+cube.w+" "+cube.price);

            inheritance1.greeting(); // calling greeting static method from parent class.
            // Now question is can we override static methods ?
            inheritance1 stat = new InheritanceWeight();
            stat.greeting(); // here you see that greetin method is not overriden
            // No it will not override because the method in the parent class will always learn no matter from
            // from which object you will call it
            // Static methods can be inherited but not overriden
            // overriding depends on object and statics does not depend on object Hence statics method can not be overriden.


    }
    
}
