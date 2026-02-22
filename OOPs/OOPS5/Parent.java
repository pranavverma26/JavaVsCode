package OOPs.OOPS5;
public abstract class Parent { // we can't do final abstract class.
    int age;
    final int value;
    public Parent(int age){
        this.age =age;
        value=48652;
    }
    abstract void carrer();
    abstract  void partner();    
    static void hello(){ //  we can create static method inside abstract class. But can't create a static abstract method.
        System.out.println("Hey");
    }
    void normal(){
        System.out.println("Hello I am in Normal Parent.");
    }
    public static void main(String[] args) {
        Son son = new Son(30);
        son.carrer();
        Daughter daughter = new Daughter(28);
        daughter.carrer();
        // Parent mom = new Parent();  You can not create object of an abstract class. But you can use it as refrence variable.
        Parent mom = new Daughter(28);
        Daughter.hello(); // we can access daughter because hello is static method.
        mom.normal();
        Parent.hello();
        // We can't also create abstract constructors.
    }  
}
class Son extends Parent{
    public Son(int age){
        super(age);
    }
    @Override
    void normal(){
        System.out.println("Hello I am in Normal Son.");
    }
    @Override
    void carrer(){
        System.out.println("I am a Engineer");
    }
    @Override
    void partner(){
        System.out.println("I love IronMan");
    }
}
class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }
    @Override
    void normal(){
        System.out.println("Hello I am in Normal Daughter.");
    }
    @Override
    void carrer(){
        System.out.println("I am a Doctor");
    }
    @Override
    void partner(){
        System.out.println("I love WandaVision");
    }
}
