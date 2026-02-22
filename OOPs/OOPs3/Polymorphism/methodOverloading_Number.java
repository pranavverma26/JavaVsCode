package OOPs.OOPs3.Polymorphism;

public class methodOverloading_Number {
    int number(int a,int b){
        return a +b;
    }
    int number(int a, int b, int c){
        return a+b+c;
    }
    double number(int a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        methodOverloading_Number sum = new methodOverloading_Number();
        System.out.println(sum.number(4,8));
        System.out.println(sum.number(4,8,2));
        System.out.println(sum.number(4,8.36));
    }
    
}
