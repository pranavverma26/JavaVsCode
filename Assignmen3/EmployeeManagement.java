import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class EmployeeManagement {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("=========================================");
        System.out.println("   Employee Management System (HashMap)  ");
        System.out.println("=========================================");
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1–5.");
                sc.next();
            }
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID (Integer): ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    if (employees.containsKey(id)) {
                        System.out.println("Employee ID already exists! Try another ID.");
                        break;
                    }
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    employees.put(id, name);
                    System.out.println("✅ Employee added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Employee ID to delete: ");
                    int delId = sc.nextInt();
                    if (employees.containsKey(delId)) {
                        employees.remove(delId);
                        System.out.println("🗑️ Employee removed successfully.");
                    } else {
                        System.out.println("❌ Employee ID not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    if (employees.containsKey(searchId)) {
                        System.out.println("Employee Found → ID: " + searchId + ", Name: " + employees.get(searchId));
                    } else {
                        System.out.println("❌ Employee ID not found!");
                    }
                    break;
                case 4:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records found!");
                    } else {
                        System.out.println("\nEmployee Details:");
                        System.out.println("------------------");
                        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
                            System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting program... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option (1–5).");
            }
        } while (choice != 5);
        sc.close();
    }
}
