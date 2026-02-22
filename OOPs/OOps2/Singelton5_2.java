package OOPs.OOps2;
 // Singelton class is the class that create only one objects.
public class Singelton5_2 {
    // if you only want to create one obj 
    // then you should not allow anyone to call the constructor of the class.So you have to make it private.
    private Singelton5_2(){

    }
    private static Singelton5_2 instance;
    /*
    This is the only object reference that will ever exist for the class.
    Since it is static, it belongs to the class itself, not to any object → so JVM loads it once and keeps it shared for all calls.
    Without this variable, there would be no way to "store" the unique object that we want to reuse.
👉 Think of it like a locker: we create one locker (instance) to store the only object. Anyone who needs the object will be given access to that same locker
     */
    /*
    y making the constructor private, we prevent outsiders from calling new.
     So the only way to get the object is through our controlled method (getInstance()).
     */
    public static Singelton5_2 getInstance(){ // This is the gateway to access the object
        // check wheter 1 obj only iss created or not
        if(instance == null) {
            instance = new Singelton5_2();
        }
        return instance;
    }
}
    

