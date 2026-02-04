interface BankService {
    void deposit();
    void withdraw();
}

class SavingsAccount implements BankService {
    public void deposit() {
        System.out.println("Deposit in Savings Account");
    }

    public void withdraw() {
        System.out.println("Withdraw from Savings Account");
    }
}

class CurrentAccount implements BankService {
    public void deposit() {
        System.out.println("Deposit in Current Account");
    }

    public void withdraw() {
        System.out.println("Withdraw from Current Account");
    }
}

public class BankServiceTest {
    public static void main(String[] args) {

        BankService b;

        b = new SavingsAccount();
        b.deposit();
        b.withdraw();

        b = new CurrentAccount();
        b.deposit();
        b.withdraw();
    }
}
