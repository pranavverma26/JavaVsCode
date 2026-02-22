package OOPs.OOps2;
class Human1_2 {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    Human1_2(int age,String name,int salary,boolean married){
        this.age =age;
        this.name = name;
        this.salary=salary;
        this.married= married;
        Human1_2.population+=1; // here we also use this and it will give right output but the convention is
        // so use class name.
    }
    void greeting(){
        System.out.println("Hello "+this.name);
    }
    
}
