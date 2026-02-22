package OOPs.OOps2;
// this is a demo to show initialisation of static variables
public class StaticBlock2_2 {
    static int a =4;
    static int b; 

    // will only run once, when the class is loaded for the first time.
    static {
        System.out.println("I am in static block");
        b = a*5;
    }
    
    public static void main(String[] args) {
        System.out.println(StaticBlock2_2.a+" "+StaticBlock2_2.b);
       // StaticBlock2_2 obj = new StaticBlock2_2();
        System.out.println(StaticBlock2_2.a+" "+StaticBlock2_2.b);
     StaticBlock2_2.b +=3;
        System.out.println(StaticBlock2_2.a+" "+StaticBlock2_2.b);

      //  StaticBlock2_2 obj2 = new StaticBlock2_2();
        System.out.println(StaticBlock2_2.a+" "+StaticBlock2_2.b);
    }
    
    
}
