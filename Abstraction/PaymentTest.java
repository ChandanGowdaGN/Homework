abstract class Payment {
    abstract void pay(double amount);
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CreditCard extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

public class PaymentTest {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay(1500);

        p = new CreditCard();
        p.pay(2500);
    }
}
