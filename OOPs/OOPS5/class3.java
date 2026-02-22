package OOPs.OOPS5;

public class class3 implements A,B {

    // The access modifier for the overrriden methods should be same or better. Ex :- If in the parents class
    // method is protected then overriden method should be protected or better then this like public not private.
    @Override
    public void greet(){

    }
    public static void main(String[] args) {
       // class3 obj = new class3();
        A.greeting();
    }
    
}
