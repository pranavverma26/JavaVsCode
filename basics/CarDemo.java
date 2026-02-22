package basics;
//Define Cor class

class Car {

String model;

int speed;

void display() {

System.out.println("Car Model: "+ model);

System.out.println("Car Speed: "+ speed+" km/h");

}

}

public class CarDemo {

public static void main(String[] args) {

Car c1 = new Car();

c1.model= "Toyota";

c1.speed =120;

c1.display();

}
}
    

