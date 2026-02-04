class Account {
    int accountNumber = 101;
}

class LoanAccount extends Account {
    int loanAmount = 50000;

    void calculateEMI() {
        System.out.println("EMI calculated");
    }

    public static void main(String[] args) {
        LoanAccount l = new LoanAccount();
        System.out.println(l.accountNumber);
        l.calculateEMI();
    }
}
