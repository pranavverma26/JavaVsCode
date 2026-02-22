package patternPrinting;
class Animal {
    String type = "Animal";

    void display() {
        System.out.println("This is an animal.");
    }
}
class Dog extends Animal {
    String type = "Dog"; 

    void display() {
        System.out.println("This is a dog.");
    }

    void showDetails() {
        System.out.println("Child type: " + type);        
        System.out.println("Parent type: " + super.type); 

        display();          
        super.display();    
    }
}

public class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.showDetails();
    }
}

