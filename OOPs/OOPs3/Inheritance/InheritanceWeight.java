package OOPs.OOPs3.Inheritance;

public class InheritanceWeight extends inheritance1 {
    double weight;
    //@Override
     static void greeting(){
        System.out.println("Hii I am in inheritanceWeight class.");
    }

    InheritanceWeight(){
        this.weight =-1;
    }
    /*
     inheritance1(inheritance1 old){
        this.h =old.h;
        this.l=old.l;
        this.w=old.w;
    }
     */
    // the below code is similar as above and we use use super(other) not write the this.h=old.h and etc
    InheritanceWeight(InheritanceWeight other){
        super(other);
        this.weight = other.weight;
    }
    InheritanceWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
    InheritanceWeight(double l,double h,double w,double weight){
         super(l,h,w); // call the parent class constructor.
        // used to initialize values present in parent class constructor.
        // here box class is initializing it so if we make l private then yha pa koi farak nhi pdega.
        // but in main we did not able to print it.
        //System.out.println(super.weight); 
        // here super.weight get acces the weight of parent class.
        // if super is not used in subclass constructor then the default constructor of parent class will be call.
        this.weight = weight;

        //                                      Super Class:-
        /*
super() is a call to the parent class constructor.
It must be the first statement in a child class constructor.
If you don’t write it, Java automatically inserts super() (which means it will call parent’s default constructor).
Uses of super():-
1. To call parent class constructor.
2. To call parent's  parameterized constructor
3.To reuse parent's initialization logic.
4. To avoid automatic call of default constructor.

         */

    }

    
}
