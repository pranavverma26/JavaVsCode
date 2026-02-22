package basics;
class Person {
    String name;

    Person(String name) {
        this.name = name; }

    void show() {
        System.out.println("Name: " + name);
    }
}
class Employee extends Person {
    int empId;
    Employee(String name, int empId) {
    super(name);
    this.empId = empId;}
    @Override
    void show() {
        super.show();  
        System.out.println("Employee ID: " + empId); }
}
public class Main1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Pranav Kr Verma", 186);
        emp.show();}
}
