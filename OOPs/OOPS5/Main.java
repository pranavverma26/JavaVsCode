package OOPs.OOPS5;

public class Main {
    public static void main(String[] args) {
        
        NiceCar car1 = new NiceCar();

        car1.start();
        car1.startMusic();
        // car1.upgradeEngine();
        // car1.start();

        NiceCar car2 = new NiceCar(new ElectricEngine());
        car2.start();

        /*
         Step-by-Step Call Flow
Line in main:
NiceCar car2 = new NiceCar(new ElectricEngine());


new ElectricEngine() → Creates an ElectricEngine object in memory.

That object is passed to NiceCar(Engine engine) constructor.

Inside the constructor:

this.engine = engine;  


→ So this.engine now points to the ElectricEngine object.

Next line:
car2.start();


JVM looks in NiceCar for a method named start().
It finds:

public void start() {
    engine.start();   // delegation
}


Now engine.start() is called.

engine is a reference of type Engine.

But at runtime, engine points to an ElectricEngine object.

Because of dynamic method dispatch, JVM executes the start() method of the actual object type (ElectricEngine).

That runs:

public void start() {
    System.out.println("Electric engine start.");
}

🔹 Output
Electric engine start.

🔹 Visualization
car2.start()
   |
   V
NiceCar.start()
   |
   V
engine.start()
   |
   V
(ElectricEngine object).start()
   |
   V
prints "Electric engine start."
         */

    }
    
}
