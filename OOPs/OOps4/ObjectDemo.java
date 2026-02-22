package OOPs.OOps4;

public class ObjectDemo {

    int num;
    public ObjectDemo(int num){
        this.num=num;
    }

    // to strings basically gives the string representation
    @Override
    public String toString() {
        return super.toString();
    }

    // finalize gets call when garbage collection hits.
    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }

    // we will go in details of how to create it in hashMap leacture.
    // Hash code basically means a unique representation of an obj via a random number.
    // HashCode give us the random number so that we can identify whether the object is same object or not.
    @Override
    public int hashCode(){
        return super.hashCode();
    }


    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException{
    return super.clone();

    }    



    public static void main(String[] args) {
        
        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj2= obj;
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj.getClass().getName()); // if you want to get data about the classes then you can use it.obj.getClass().__
    }
    


}
