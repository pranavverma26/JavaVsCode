package Sessional3;
import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {

    // Form Components
    private JTextField nameField, mobileField, dobField;
    private JRadioButton maleBtn, femaleBtn;
    private JTextArea addressArea, outputArea;
    private JCheckBox termsCheck;
    private JButton submitBtn, resetBtn;
    private ButtonGroup genderGroup;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(null); 

        // === Labels and Fields ===
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 100, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(180, 30, 200, 30);
        add(nameField);

        JLabel mobileLabel = new JLabel("Mobile No:");
        mobileLabel.setBounds(50, 80, 100, 30);
        add(mobileLabel);

        mobileField = new JTextField();
        mobileField.setBounds(180, 80, 200, 30);
        add(mobileField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 130, 100, 30);
        add(genderLabel);

        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        maleBtn.setBounds(180, 130, 80, 30);
        femaleBtn.setBounds(260, 130, 100, 30);

        genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);

        add(maleBtn);
        add(femaleBtn);

        JLabel dobLabel = new JLabel("Date of Birth:");
        dobLabel.setBounds(50, 180, 100, 30);
        add(dobLabel);

        dobField = new JTextField("DD/MM/YYYY");
        dobField.setBounds(180, 180, 200, 30);
        add(dobField);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 230, 100, 30);
        add(addressLabel);

        addressArea = new JTextArea();
        addressArea.setBounds(180, 230, 200, 60);
        add(addressArea);

        termsCheck = new JCheckBox("Accept Terms & Conditions");
        termsCheck.setBounds(100, 310, 250, 30);
        add(termsCheck);

        submitBtn = new JButton("Submit");
        submitBtn.setBounds(100, 360, 100, 30);
        submitBtn.addActionListener(this);
        add(submitBtn);

        resetBtn = new JButton("Reset");
        resetBtn.setBounds(220, 360, 100, 30);
        resetBtn.addActionListener(this);
        add(resetBtn);

        JLabel outputLabel = new JLabel("Submitted Details:");
        outputLabel.setBounds(50, 410, 150, 30);
        add(outputLabel);

        outputArea = new JTextArea();
        outputArea.setBounds(50, 440, 380, 100);
        outputArea.setEditable(false);
        add(outputArea);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitBtn) {
            if (!termsCheck.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please accept Terms & Conditions to proceed!");
                return;
            }

            String name = nameField.getText();
            String mobile = mobileField.getText();
            String gender = maleBtn.isSelected() ? "Male" : femaleBtn.isSelected() ? "Female" : "Not Selected";
            String dob = dobField.getText();
            String address = addressArea.getText();

            // Displaying in outputArea
            outputArea.setText("=== Registration Details ===\n");
            outputArea.append("Name: " + name + "\n");
            outputArea.append("Mobile: " + mobile + "\n");
            outputArea.append("Gender: " + gender + "\n");
            outputArea.append("DOB: " + dob + "\n");
            outputArea.append("Address: " + address + "\n");

        } else if (e.getSource() == resetBtn) {
            // Clearing all fields
            nameField.setText("");
            mobileField.setText("");
            dobField.setText("DD/MM/YYYY");
            addressArea.setText("");
            genderGroup.clearSelection();
            termsCheck.setSelected(false);
            outputArea.setText("");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}

