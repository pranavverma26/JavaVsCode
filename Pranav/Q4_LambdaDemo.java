package Pranav;

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}
public class Q4_LambdaDemo {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;
        System.out.println("Addition of 10 and 20: " + add.operation(10, 20));
        System.out.println("Multiplication of 10 and 20: " + multiply.operation(10, 20));
    }
}

