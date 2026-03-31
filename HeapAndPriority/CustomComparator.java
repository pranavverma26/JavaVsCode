import java.util.Arrays;
class Student implements Comparable<Student>{
    int rno;
    double perc;
    String name;
    Student(String name,int rno,double perc){
        this.name=name;
        this.rno=rno;
        this.perc=perc;
    }
    public int compareTo(Student s){
        return s.rno-this.rno;
    }
}
public class CustomComparator {
    public static void print(Student[] s){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i].name+" "+s[i].rno+" "+s[i].perc);
        }

    }
    public static void main(String[] args) {
        Student[] s= new Student[5];
        s[0] = new Student("Pranav",88,100);
        s[1] = new Student("Ashish",77,98.5);
        s[2] = new Student("Naman",93,99);
        s[3] = new Student("Ansh",9,99.97);
        s[4] = new Student("Arjun",8,96);
        Arrays.sort(s);
        print(s);
    }
    
}
