package Question_1_ATM;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM("Rajesh", "1234567890", 10000);

        atm.displayBalance();

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();

        try {
            atm.deposit(depositAmount);
        } catch (IllegalArgumentException e) {
            System.out.println("Deposit failed: " + e.getMessage());
        }

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();

        atm.withdraw(withdrawalAmount);

        System.out.println("\nFinal Account Details:");
        atm.displayBalance();

        sc.close();
    }
}
