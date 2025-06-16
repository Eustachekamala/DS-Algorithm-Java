import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);
        System.out.println("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);

        PaymentProcessor processor = new PaymentProcessor("1234567890", account.withdraw(sc.nextDouble()));
        processor.processPayment();

        System.out.println("Your current balance is: $" + account.getBalance());
    }
}