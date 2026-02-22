package OOPs.OOPs3.Inheritance;
public class inheritance1 {
    private double l;
    double h;
    double w;
    static void greeting(){
        System.out.println("Hii I am in inheritance1 class.");
    }
    public double getL(){
        return l;
    }

   // double weight;
    inheritance1(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    // cube 
    inheritance1(double side){
        this.w =side;
        this.l=side;
        this.h=side;
    }
    inheritance1(double l,double h,double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    inheritance1(inheritance1 old){
        this.h =old.h;
        this.l=old.l;
        this.w=old.w;
    }
    /*
    if we do not make a contructor as perimter then in case :-
    suppose you already have an object and you want to create a new object with the same values.
    Instead of setting each variable one by one like below, you can just pass the object to the constructor.
    inheritance1 box1 = new inheritance1(10, 20, 30);
    If I want another box with same dimensions
    inheritance1 box2 = new inheritance1();
    box2.l = box1.l;
    box2.h = box1.h;
    box2.w = box1.w;
    inheritance1 box1 = new inheritance1(10, 20, 30);
    // directly copy box1 into box2
    inheritance1 box2 = new inheritance1(box1);
 */
     public void information(){
        System.out.println("Running the inheritance.");
     }
}

