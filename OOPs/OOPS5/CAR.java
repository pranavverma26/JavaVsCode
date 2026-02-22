package OOPs.OOPS5;

public class  CAR implements Brake,Engine,Media {
    // In interface by default variables are public static and final.
    // Interfaces basically contains abstract functions.

    int a =30;

    @Override
   public void brake(){
        System.out.println("I brake like a normal car.");
    }

     @Override
   public void start(){
        System.out.println("I start like a normal car.");
    }

     @Override
   public void stop(){
        System.out.println("I stop like a normal car.");
    }

     @Override
   public void acc(){
        System.out.println("I accelerate like a normal car.");
    }

    public static void main(String[] args) {

        CAR car = new CAR();

        car.start();
        car.stop();
        car.acc();
        car.brake();

        // We can also do type of reference as interface.

        Engine car2 = new CAR();

        // car2.a; it will give error bcz reference type decides which variables you can access.

        // car2.brake(); It will also give error bcz is not defined in engine.

        // You should not use interface in proformance critical code.

        // Engine and Media both contains start and stop.

        
    }

    
}

interface Brake{
    void brake();

}

interface Engine {

    int price=780000; // In interface by default variables are public static and final.

    void start();
    void stop();
    void acc();

    
}

interface Media{
    void start();
    void stop();
}