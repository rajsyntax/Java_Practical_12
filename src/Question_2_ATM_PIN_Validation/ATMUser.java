package Question_2_ATM_PIN_Validation;


class ATMUser {
    private String accountHolderName;
    private String accountNumber;
    private String pin;

    public ATMUser(String accountHolderName, String accountNumber, String pin) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public void verifyPIN(String enteredPIN) throws InvalidPINException {
        if (!pin.equals(enteredPIN)) {
            throw new InvalidPINException("Incorrect PIN.");
        }

        System.out.println("PIN verified successfully.");
        System.out.println("Welcome, " + accountHolderName + "!");
    }
}

