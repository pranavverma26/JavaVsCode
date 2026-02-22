package Sessional3;
import java.util.*;

public class UniqueStudents {
    public static void main(String[] args) {
        HashSet<String> studentNames = new HashSet<>();
        studentNames.add("Pranav");
        studentNames.add("Naman");
        studentNames.add("Harisudhaan");
        studentNames.add("Ashish");
        studentNames.add("Ritwik"); 
        studentNames.add("Arjun"); 
        System.out.println("List of Unique Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }
        System.out.println("\nTotal names added (including duplicates): 6");
        System.out.println("Unique names stored in HashSet: " + studentNames.size());
    }
}

