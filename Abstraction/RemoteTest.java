interface Remote {
    void turnOn();
    void turnOff();
}

class TV implements Remote {
    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

class AC implements Remote {
    public void turnOn() {
        System.out.println("AC is ON");
    }

    public void turnOff() {
        System.out.println("AC is OFF");
    }
}

public class RemoteTest {
    public static void main(String[] args) {

        Remote r;

        r = new TV();
        r.turnOn();
        r.turnOff();

        r = new AC();
        r.turnOn();
        r.turnOff();
    }
}
