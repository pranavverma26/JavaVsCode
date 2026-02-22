package OOPs.OOPs3.Polymorphism;

public class shape{
    void area(){
        System.out.println("I am in shape");
    }
    public static void main(String[] args) {
        shape s1 = new shape();
        circle c1 = new circle();
        triangle t1 = new triangle();
        s1.area();
        c1.area();
        t1.area();
        shape s2 = new square();
        // what is being accesed depend on refernce type.
        // type of method in overriding that is call depends on what the type of the object is.
        s2.area();
    }
    
}
// this will run when obj of circle is created
// hence it is overriding the parent method.
class circle extends shape{
    // this will run when obj of circle is created
    // hence it is overriding the parent method.
    @Override //this is called annotation
    void area(){
        System.out.println("Area is pie * r * r");
    }
   // @Override here it will not override because this method is not present in parent class.
    void area2(){
        System.out.println("Area");
    }

}
class triangle extends shape{
    void area(){
        System.out.println("Area is 0.5 * b * h");
    }

}
class square extends shape{
    // void area(){
    //     System.out.println("Area is sq of side");
    // }

}
// final is also used to prevent inheritance.
// whenever you put a class as final implicitly it declares all of its method final too.