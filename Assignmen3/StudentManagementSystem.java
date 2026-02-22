import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Student {
    private int rollNo;
    private String name;
    private double marks;
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public double getMarks() { return marks; }
    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}
class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getMarks(), s1.getMarks()); 
    }
}
public class StudentManagementSystem extends JFrame implements ActionListener {
    private JTextField rollField, nameField, marksField;
    private JTextArea displayArea;
    private JButton addButton, deleteButton, sortButton, clearButton;
    private ArrayList<Student> students;
    public StudentManagementSystem() {
        setTitle("Student Management System");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));
        students = new ArrayList<>();
        JLabel title = new JLabel("Student Management System", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        add(title, BorderLayout.NORTH);
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Enter Student Details"));
        inputPanel.add(new JLabel("Roll No:"));
        rollField = new JTextField();
        inputPanel.add(rollField);
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Marks:"));
        marksField = new JTextField();
        inputPanel.add(marksField);
        add(inputPanel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");
        sortButton = new JButton("Sort by Marks");
        clearButton = new JButton("Clear Display");
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(sortButton);
        buttonPanel.add(clearButton);
        add(buttonPanel, BorderLayout.SOUTH);
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        add(new JScrollPane(displayArea), BorderLayout.EAST);
        addButton.addActionListener(this);
        deleteButton.addActionListener(this);
        sortButton.addActionListener(this);
        clearButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            addStudent();
        } else if (e.getSource() == deleteButton) {
            deleteStudent();
        } else if (e.getSource() == sortButton) {
            sortStudents();
        } else if (e.getSource() == clearButton) {
            displayArea.setText("");
        }
    }
    private void addStudent() {
        try {
            int rollNo = Integer.parseInt(rollField.getText().trim());
            String name = nameField.getText().trim();
            double marks = Double.parseDouble(marksField.getText().trim());
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            students.add(new Student(rollNo, name, marks));
            display("✅ Student added successfully!");
            showAllStudents();
            rollField.setText("");
            nameField.setText("");
            marksField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input! Roll No and Marks must be numeric.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void deleteStudent() {
        if (students.isEmpty()) {
            display("No records to delete!");
            return;
        }
        String rollStr = JOptionPane.showInputDialog(this, "Enter Roll No to Delete:");
        if (rollStr == null) return;
        try {
            int rollNo = Integer.parseInt(rollStr);
            boolean removed = students.removeIf(s -> s.getRollNo() == rollNo);
            if (removed) {
                display("🗑️ Student with Roll No " + rollNo + " deleted successfully.");
            } else {
                display("❌ Roll No not found!");
            }
            showAllStudents();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Roll Number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void sortStudents() {
        if (students.isEmpty()) {
            display("No records to sort!");
            return;
        }
        students.sort(new MarksComparator());
        display("📊 Students sorted by marks (highest to lowest).");
        showAllStudents();
    }
    private void showAllStudents() {
        StringBuilder sb = new StringBuilder("\n--- Student Records ---\n");
        for (Student s : students) {
            sb.append(s.toString()).append("\n");
        }
        displayArea.setText(sb.toString());
    }
    private void display(String message) {
        displayArea.append(message + "\n");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StudentManagementSystem().setVisible(true);
        });
    }
}

