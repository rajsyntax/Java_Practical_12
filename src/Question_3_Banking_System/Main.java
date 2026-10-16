package Question_3_Banking_System;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(
                "1234567890", "Harsh", 20000
        );

        account.displayAccountDetails();

        try {
            account.deposit(5000);
            account.checkBalance();

            account.withdraw(8000);
            account.checkBalance();

            account.withdraw(30000);

        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        System.out.println("\nFinal Account Details:");
        account.displayAccountDetails();
    }
}
