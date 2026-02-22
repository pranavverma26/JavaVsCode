package OOPs.OOps2;

public class  SingeltonClass4_2{ 
    public static void main(String[] args) {
        Singelton5_2 obj = Singelton5_2.getInstance();
        Singelton5_2 obj1 = Singelton5_2.getInstance();
        Singelton5_2 obj2 = Singelton5_2.getInstance();

        // all three refrence variable are pointing to just one object.
        /*
        Here we don’t use new because the constructor is private.
        Instead, we call a static method (getInstance()) which controls object creation.
        Inside getInstance(), the code decides:
        If no object exists → create one with new Singelton5_2().
        If already created → return the existing one
         */
        
    }
    
}

