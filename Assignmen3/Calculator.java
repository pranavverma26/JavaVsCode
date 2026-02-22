import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subButton, mulButton, divButton, clearButton;

    public Calculator() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new BorderLayout());
        JLabel title = new JLabel("Calculator", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        add(title, BorderLayout.NORTH);
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));
        inputPanel.add(new JLabel("First Number:"));
        num1Field = new JTextField();
        inputPanel.add(num1Field);
        inputPanel.add(new JLabel("Second Number:"));
        num2Field = new JTextField();
        inputPanel.add(num2Field);
        inputPanel.add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        inputPanel.add(resultField);
        add(inputPanel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new GridLayout(1, 5, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("×");
        divButton = new JButton("÷");
        clearButton = new JButton("C");
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        clearButton.addActionListener(this);
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(mulButton);
        buttonPanel.add(divButton);
        buttonPanel.add(clearButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle "Clear" button
        if (e.getSource() == clearButton) {
            num1Field.setText("");
            num2Field.setText("");
            resultField.setText("");
            return;
        }
        double num1, num2, result = 0.0;
        try {
            num1 = Double.parseDouble(num1Field.getText().trim());
            num2 = Double.parseDouble(num2Field.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            if (e.getSource() == addButton)
                result = num1 + num2;
            else if (e.getSource() == subButton)
                result = num1 - num2;
            else if (e.getSource() == mulButton)
                result = num1 * num2;
            else if (e.getSource() == divButton) {
                if (num2 == 0) throw new ArithmeticException("Division by zero");
                result = num1 / num2;
            }
            resultField.setText(String.valueOf(result));
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Math Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
}

