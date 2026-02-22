package Pranav;

class Account {
    private int balance;
    private int accNo;

    public Account(int accNo, int initialBalance) {
        this.accNo = accNo;
        if (initialBalance < 500) {
            this.balance = 500;
        } else {
            this.balance = initialBalance;
        }
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in AccNo " + accNo + ". Balance: " + balance);
    }

    public void withdraw(int amount) throws LessBalanceException {
        if (balance - amount < 500) {
            throw new LessBalanceException("Withdraw Amount(" + amount + " Rs) is Not Valid. Minimum balance should remain 500.");
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + " from AccNo " + accNo + ". Balance: " + balance);
    }
}

