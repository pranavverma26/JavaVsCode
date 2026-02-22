package OOPs.OOPs1;
import java.util.Arrays;

public class oops1 {
    
    public static void main(String[] args) {

        //store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name ,marks}

        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks= new float[5];

        // no then teacher make a data type in which every single element will contain string,int,float data.So here we need oops for that.
        // if have to combine these all three data type we need class.

        Student[] students = new Student[5];
         // Only after declaration if we print :-
        System.out.println(Arrays.toString(students)); // o/p = null
        

        //Student kunal; // just declaring but initialize.
       // System.out.println(kunal.rno); It will give error because variable kunal is not initialized.
       Student kunal = new Student(); // declaration and initialization both.
       System.out.println(kunal); // its o/p is some random value.
       System.out.println(kunal.rno); // by default it's o/p = 0.
       System.out.println(kunal.name); // by deault o/p = null
       System.out.println(kunal.marks); // by deault o/p = 0.0

    System.out.println("now assign value :-");

       kunal.rno=13;
       kunal.name="Kunal Kushwaha";
       kunal.marks=88.5f;
       

       // calling a method from class :-
       Student rahul = new Student();
       System.out.println("calling a method from student class:-");

       rahul.name="Rahul kumar";
       rahul.greeting();

       // now print:-

       System.out.println(kunal.rno); 
       System.out.println(kunal.name); 
       System.out.println(kunal.marks);

       // use constructor :- A constructor is a special method in a class that is used to initialize objects.


       System.out.println("Using default constructor :-"); 
       Student student1 = new Student();
       System.out.println(student1.name); // print null if not define any constructor in class


       System.out.println("Using parameterized constructor :-");
       Student student2 = new Student(7,"Pranav Verma",98.8f);
       System.out.println(student2.rno); 
       System.out.println(student2.name); 
       System.out.println(student2.marks);
       Student student3 = new Student(8,"Pranav Verma",98.8f);
       System.out.println(student3.rno); 

       //if we make a object and there is no parameter in it and also in class only parametrized
      // constructor is present not any default constructor is present then it will give an error.

      // now we make a object where parameter is also an object.
      Student random = new Student(kunal); // In this in class this is repalced by random and other is replaced by kunal.
      System.out.println(random.name);

      
      // here it will print from another constructor(parameterized constructor)
      Student random2 = new Student();
      System.out.println(random2.name);

      // In java primitive data types are not implemented as object. They are stored in stack memory.

      Student one = new Student();
      Student two = one;  // here two and one both point towards the same object or refrence to the same memory in the heap.

      one.name = "Something Something";
      System.out.println(two.name); // its output is also someting something
      
    }
}


    // create a class
    // for every single student
    class Student{
        int rno;
        String name;
        float marks;

        // making a constructor that take value from another object.
        Student (Student other){
            this.name=other.name;      // I want my current name to the equal to the previous name.
            this.rno=other.rno;
            this.marks=other.marks;
        }

        // Default Constructor
        Student(){
            // we need a way to add the values of the above properties object by object.
            // we need one word to access every object.
            // this.rno =0;
            // this.name = "Not known";
            // this.marks=0f;

            // this is how yo call a constructor from another constructor
            this(8,"Shreya",100f); // we can also do the same thing in parameterized constructor.
            
        }
        
        // Parameterized constructor.
        Student(int rno,String name,float marks){
        // Case 1: Without this
        // rno = rno;   // ❌ Wrong (parameter assigned to itself)
        // name = name; // ❌ Wrong

        // // Case 2: With this
        // this.rno = rno;   // ✅ Field = parameter
        // this.name = name; // ✅
            this.rno=rno;       // if the parameters in constructor is not same as fields then 
            this.name=name;     // we can write rno=roll(if roll is written in parameter instead of rno)
            this.marks=marks;
            
        }

        void greeting(){
            System.out.println("Hii my name is "+this.name);
        }

    }


