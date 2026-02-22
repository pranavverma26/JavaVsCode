package basics;
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class BabyDog extends Dog {
    void weep() {
        System.out.println("Baby Dog is weeping");}}
public class Main4 {
    public static void main(String[] args) {
        BabyDog bdog = new BabyDog();
        bdog.eat();  
        bdog.bark();  
        bdog.weep();  
}
}
