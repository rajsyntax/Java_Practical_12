package Question_2_ATM_PIN_Validation;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATMUser user = new ATMUser("Rajesh", "1234567890", "2580");

        int attempts = 0;
        boolean verified = false;

        while (attempts < 3 && !verified) {
            System.out.print("Enter PIN: ");
            String enteredPIN = sc.nextLine();

            attempts++;

            try {
                user.verifyPIN(enteredPIN);
                verified = true;
            } catch (InvalidPINException e) {
                System.out.println(e.getMessage());

                if (attempts < 3) {
                    System.out.println(
                            "Attempts remaining: " + (3 - attempts)
                    );
                }
            }
        }

        if (!verified) {
            System.out.println("Account temporarily blocked.");
        }

        sc.close();
    }
}

