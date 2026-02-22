package OOPs.OOPs6;
import java.util.ArrayList;
import java.util.Arrays;
public class CustomArrayList {

    /*
     Generics mean parameterized types.
    In simple terms → instead of writing code for every data type separately, you can write a single class/method that works with any type.

    👉 Example without Generics:

ArrayList list = new ArrayList();
list.add("Hello");
list.add(123);  // Allowed


This allows adding different types (String, Integer, etc.).

But when retrieving values, you must cast manually, which can cause runtime errors.

👉 Example with Generics:

ArrayList<String> list = new ArrayList<>();
list.add("Hello");
// list.add(123); ❌ Error at compile-time


Now this list only stores String.

No need for casting while retrieving.

Errors are caught at compile-time, not runtime
     */

    private int[] data;
    private static int Default_size=10;
    private int size = 0;

    
    public CustomArrayList(){
        this.data = new int[Default_size];

    }

    public void add(int num){
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length*2];

        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data=temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;

    }
    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index] = value;
    }
    

    public int get(int index){
        return data[index];
    }



    private boolean isFull() {
        return size == data.length;
    }

    public String toString(){
        return "CustomArrayList{"+
                "data="+ Arrays.toString(data)+
                ", size="+size+
                '}';
   }

     public static void main(String[] args) {

        //ArrayList list = new ArrayList();

        // list.add(45);
        // list.remove(0);
        // list.get(0);
        // list.set(1,6789);
        // list.size();
        // list.isEmpty();

        CustomArrayList list = new CustomArrayList();
        list.add(4);
        System.out.println(list.get(0));

      //  ArrayList list2 =  new ArrayList<>(); this is without generic.
       ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
      //  list2.add("Hello"); This will give error.
        System.out.println(list2.get(0));

        
    }
    
}
