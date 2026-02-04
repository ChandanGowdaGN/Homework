interface OnlinePayment {
    void processPayment();
}

class Paytm implements OnlinePayment {
    public void processPayment() {
        System.out.println("Payment processed using Paytm");
    }
}

class GooglePay implements OnlinePayment {
    public void processPayment() {
        System.out.println("Payment processed using Google Pay");
    }
}

public class OnlinePaymentTest {
    public static void main(String[] args) {

        OnlinePayment p;

        p = new Paytm();
        p.processPayment();

        p = new GooglePay();
        p.processPayment();
    }
}
