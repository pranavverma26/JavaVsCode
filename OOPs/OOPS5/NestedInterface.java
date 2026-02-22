package OOPs.OOPS5;

public class NestedInterface {

    // nested interface
    // In this nested interface should be anything public,private or protected.
    // But top level interface has to be declared public or default one.
    public interface NestInt {
        boolean isOdd(int num);

    }
    
}

class B2 implements NestedInterface.NestInt {

    @Override
    public boolean isOdd(int num){
        if(num%2 != 0){
             return true;
        }
        return true;
    }
    public static void main(String[] args) {
        B2 obj = new B2();
        System.out.println(obj.isOdd(7));
    }
}
