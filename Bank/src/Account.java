public class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    private boolean validateWithdrawal(double amount) {
        return amount > 0 && amount <= balance;
    }

    public double withdraw(double amount) {
        if (validateWithdrawal(amount)) {
            balance -= amount;
        } else {
            System.out.println("You entered an amount greater than your current balance");
        }
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}
