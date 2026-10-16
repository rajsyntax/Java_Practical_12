package Question_4_Loan_Eligibility;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Rahul", 25, 30000, 750);

        try {
            customer.checkLoanEligibility();
        } catch (LoanEligibilityException e) {
            System.out.println("Loan Eligibility Failed: " + e.getMessage());
        }
    }
}
