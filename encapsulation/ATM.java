class ATM {
    private double balance = 5000;
    private int pin = 1234;

    void withdraw(int enteredPin, double amount) {
        if (enteredPin == pin && amount <= balance) {
            balance -= amount;
            System.out.println(balance);
        }
    }

    public static void main(String[] args) {
        ATM a = new ATM();
        a.withdraw(1234, 1000);
    }
}
