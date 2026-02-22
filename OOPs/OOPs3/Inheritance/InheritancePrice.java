package OOPs.OOPs3.Inheritance;

public class InheritancePrice extends InheritanceWeight{
    double price;

    InheritancePrice(){
        this.price = -1;
    }

    InheritancePrice(InheritancePrice other){
        super(other);
        this.price = other.price;
    }
    InheritancePrice(double l, double h,double w,double weight,double price){
        super(l,w,h,weight);
        this.price = price;
    }

    InheritancePrice(double side,double weight,double price){
        super(side,weight);
        this.price = price;
    }
    
}
