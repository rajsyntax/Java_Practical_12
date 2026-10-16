package Question_1_ATM;


class ATM {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    ATM(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit amount must be greater than 0."
            );
        }

        balance += amount;
        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException(
                        "Withdrawal amount must be greater than 0."
                );
            }

            if (amount > balance) {
                throw new IllegalArgumentException(
                        "Insufficient balance."
                );
            }

            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: Rs. " + balance);

        } catch (IllegalArgumentException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: Rs. " + balance);
    }
}

