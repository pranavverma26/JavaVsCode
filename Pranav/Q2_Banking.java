package Pranav;

public class Q2_Banking {
    public static void main(String[] args) {
        Account acc1 = new Account(117, 210);
        Account acc2 = new Account(102, 40000);
        acc1.deposit(5);
        acc2.deposit(1000);
        try {
            acc1.withdraw(40);
            acc2.withdraw(1800); 
        } catch (LessBalanceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}

