package basics;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}
public class Main5 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum1 = calc.add(13, 12);          
        int sum2 = calc.add(7, 8, 9);       
        double sum3 = calc.add(1.2, 4.3);    
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
    }
}