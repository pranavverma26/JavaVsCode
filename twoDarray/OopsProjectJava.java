package twoDarray;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.SimpleDateFormat;

// Simple GUI-only Airline Reservation System
// Main class name: OopsProjectJava
public class OopsProjectJava {

    // ----------------- Model classes -----------------
    static class Passenger {
        protected String name;
        protected int age;
        protected String gender;

        public Passenger(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
    }

    static class Ticket extends Passenger {
        private String flightNumber;
        private String source;
        private String destination;
        private Date travelDate;
        private double fare;
        private boolean confirmed;

        public Ticket(String name, int age, String gender,
                      String flightNumber, String source, String destination,
                      Date travelDate, double fare) {
            super(name, age, gender);
            this.flightNumber = flightNumber;
            this.source = source;
            this.destination = destination;
            this.travelDate = travelDate;
            this.fare = fare;
            this.confirmed = true;
        }

        public String getName() { return name; }
        public boolean isConfirmed() { return confirmed; }
        public void cancel() { confirmed = false; }

        @Override
        public String toString() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            return String.format("%s | %s→%s | %s | %s | ₹%.0f | %s",
                    name, source, destination, flightNumber, sdf.format(travelDate),
                    fare, confirmed ? "Confirmed" : "Cancelled");
        }
    }

    // --------------- Application state ----------------
    private final java.util.List<Ticket> bookings = new ArrayList<>();
    private final String[] cities = {"Delhi", "Mumbai", "Bangalore", "Chennai", "Kolkata", "Hyderabad"};

    // --------------- Main GUI -------------------------
    private JFrame mainFrame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new OopsProjectJava().createAndShowGUI());
    }

    private void createAndShowGUI() {
        mainFrame = new JFrame("Airline Reservation - OopsProjectJava");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600, 420);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);

        JPanel root = new JPanel(new BorderLayout(10, 10));
        root.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        JLabel title = new JLabel("Airline Reservation System", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));
        root.add(title, BorderLayout.NORTH);

        JPanel menu = new JPanel(new GridLayout(4, 1, 10, 10));
        JButton bookBtn = new JButton("1. Book (Date first, then route)");
        JButton cancelBtn = new JButton("2. Cancel booking");
        JButton viewBtn = new JButton("3. View bookings");
        JButton exitBtn = new JButton("4. Exit");

        styleMenuButton(bookBtn);
        styleMenuButton(cancelBtn);
        styleMenuButton(viewBtn);
        styleMenuButton(exitBtn);

        menu.add(bookBtn);
        menu.add(cancelBtn);
        menu.add(viewBtn);
        menu.add(exitBtn);

        root.add(menu, BorderLayout.CENTER);

        // Button actions
        bookBtn.addActionListener(e -> openBookingFlow());
        cancelBtn.addActionListener(e -> openCancelDialog());
        viewBtn.addActionListener(e -> openViewBookings());
        exitBtn.addActionListener(e -> System.exit(0));

        mainFrame.setContentPane(root);
        mainFrame.setVisible(true);
    }

    private void styleMenuButton(JButton b) {
        b.setFont(new Font("Segoe UI", Font.BOLD, 16));
        b.setBackground(new Color(25, 118, 210));
        b.setForeground(Color.WHITE);
        b.setFocusPainted(false);
    }

    // -------------- Booking Flow ----------------------
    private void openBookingFlow() {
        // Step A: Select Date (JSpinner date)
        JPanel datePanel = new JPanel(new BorderLayout(8,8));
        JLabel lbl = new JLabel("Select Travel Date:", SwingConstants.CENTER);
        lbl.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        JSpinner dateSpinner = new JSpinner(new SpinnerDateModel());
        dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, "dd-MM-yyyy"));
        dateSpinner.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        datePanel.add(lbl, BorderLayout.NORTH);
        datePanel.add(dateSpinner, BorderLayout.CENTER);

        int res = JOptionPane.showConfirmDialog(mainFrame, datePanel, "Step 1 - Pick Date",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (res != JOptionPane.OK_OPTION) return;

        Date travelDate = (Date) dateSpinner.getValue();

        // Step B: Source & Destination
        JPanel routePanel = new JPanel(new GridLayout(3,2,8,8));
        routePanel.add(new JLabel("Source:"));
        JComboBox<String> srcBox = new JComboBox<>(cities);
        routePanel.add(srcBox);
        routePanel.add(new JLabel("Destination:"));
        JComboBox<String> destBox = new JComboBox<>(cities);
        routePanel.add(destBox);
        routePanel.add(new JLabel()); // spacer
        routePanel.add(new JLabel()); // spacer

        int r = JOptionPane.showConfirmDialog(mainFrame, routePanel, "Step 2 - Choose Route",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (r != JOptionPane.OK_OPTION) return;

        String src = (String) srcBox.getSelectedItem();
        String dest = (String) destBox.getSelectedItem();
        if (src.equals(dest)) {
            JOptionPane.showMessageDialog(mainFrame, "Source and destination cannot be the same.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Step C: Show 5 flight options
        java.util.List<String[]> flightOptions = buildFiveFlights(src, dest, travelDate);
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (int i = 0; i < flightOptions.size(); i++) {
            String[] f = flightOptions.get(i);
            listModel.addElement((i+1) + ". " + f[0] + "  |  " + f[1] + " → " + f[2] + "  |  ₹" + f[3]);
        }
        JList<String> flist = new JList<>(listModel);
        flist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        flist.setVisibleRowCount(6);
        flist.setFont(new Font("Monospaced", Font.PLAIN, 13));

        int pick = JOptionPane.showConfirmDialog(mainFrame, new JScrollPane(flist),
                "Step 3 - Select a Flight (choose one)", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (pick != JOptionPane.OK_OPTION) return;
        int sel = flist.getSelectedIndex();
        if (sel < 0) {
            JOptionPane.showMessageDialog(mainFrame, "Please select a flight to continue.", "No Flight Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String[] chosen = flightOptions.get(sel);
        String flightNum = chosen[0];
        double fare = Double.parseDouble(chosen[3]);

        // Step D: Passenger Details
        JPanel passPanel = new JPanel(new GridLayout(4,2,8,8));
        passPanel.add(new JLabel("Passenger Name:"));
        JTextField nameField = new JTextField();
        passPanel.add(nameField);
        passPanel.add(new JLabel("Age:"));
        JTextField ageField = new JTextField();
        passPanel.add(ageField);
        passPanel.add(new JLabel("Gender:"));
        JTextField genderField = new JTextField();
        passPanel.add(genderField);

        int done = JOptionPane.showConfirmDialog(mainFrame, passPanel, "Step 4 - Passenger Details",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (done != JOptionPane.OK_OPTION) return;

        String name = nameField.getText().trim();
        String ageStr = ageField.getText().trim();
        String gender = genderField.getText().trim();
        if (name.isEmpty() || ageStr.isEmpty() || gender.isEmpty()) {
            JOptionPane.showMessageDialog(mainFrame, "All passenger fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int age;
        try {
            age = Integer.parseInt(ageStr);
            if (age <= 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(mainFrame, "Invalid age. Enter a positive integer.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Confirm booking
        Ticket ticket = new Ticket(name, age, gender, flightNum, src, dest, travelDate, fare);
        bookings.add(ticket);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        JOptionPane.showMessageDialog(mainFrame,
                "Booking Confirmed!\n" + ticket.toString(),
                "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    // Build at least 5 flight options for the route (different fares, numbers)
    private java.util.List<String[]> buildFiveFlights(String src, String dest, Date date) {
        java.util.List<String[]> list = new ArrayList<>();
        // base synthetic flights
        for (int i = 1; i <= 5; i++) {
            String flightNo = "AI" + (200 + i);
            int fare = 4000 + (int)(Math.random() * 3000) + i*100;
            list.add(new String[]{flightNo, src, dest, String.valueOf(fare)});
        }
        return list;
    }

    // -------------- View and Cancel -------------------
    private void openViewBookings() {
        if (bookings.isEmpty()) {
            JOptionPane.showMessageDialog(mainFrame, "No bookings found.", "Bookings", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Ticket t : bookings) model.addElement(t.toString());
        JList<String> list = new JList<>(model);
        list.setFont(new Font("Monospaced", Font.PLAIN, 12));
        list.setVisibleRowCount(10);
        JScrollPane scroll = new JScrollPane(list);
        scroll.setPreferredSize(new Dimension(520, 300));
        JOptionPane.showMessageDialog(mainFrame, scroll, "All Bookings", JOptionPane.INFORMATION_MESSAGE);
    }

    private void openCancelDialog() {
        if (bookings.isEmpty()) {
            JOptionPane.showMessageDialog(mainFrame, "No bookings to cancel.", "Cancel", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Ticket t : bookings) model.addElement(t.toString());
        JList<String> list = new JList<>(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scroll = new JScrollPane(list);
        scroll.setPreferredSize(new Dimension(520, 300));

        int res = JOptionPane.showConfirmDialog(mainFrame, scroll, "Select a booking to cancel",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (res != JOptionPane.OK_OPTION) return;
        int idx = list.getSelectedIndex();
        if (idx < 0) {
            JOptionPane.showMessageDialog(mainFrame, "No booking selected.", "Cancel", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Ticket t = bookings.get(idx);
        int conf = JOptionPane.showConfirmDialog(mainFrame, "Cancel this booking?\n" + t.toString(),
                "Confirm Cancel", JOptionPane.YES_NO_OPTION);
        if (conf == JOptionPane.YES_OPTION) {
            t.cancel();
            JOptionPane.showMessageDialog(mainFrame, "Booking cancelled.", "Cancelled", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
