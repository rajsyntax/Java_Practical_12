package Question_4_Loan_Eligibility;

class Customer {
    private String name;
    private int age;
    private double monthlyIncome;
    private int creditScore;

    public Customer(String name, int age, double monthlyIncome, int creditScore) {
        this.name = name;
        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.creditScore = creditScore;
    }

    public void checkLoanEligibility() throws LoanEligibilityException {
        if (age < 21) {
            throw new LoanEligibilityException(
                    "Age must be at least 21."
            );
        }

        if (monthlyIncome < 25000) {
            throw new LoanEligibilityException(
                    "Monthly income must be at least Rs. 25000."
            );
        }

        if (creditScore < 700) {
            throw new LoanEligibilityException(
                    "Credit score must be at least 700."
            );
        }

        System.out.println(
                "Congratulations! " + name + " is eligible for the loan."
        );
    }
}
