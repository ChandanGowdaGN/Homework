class ElectronicDevice {
    String brand;

    void powerOn() {
        System.out.println("Power On");
    }
}

class Laptop extends ElectronicDevice {
    int ramSize;

    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.brand = "Dell";
        l.ramSize = 8;
        l.powerOn();
        System.out.println(l.ramSize);
    }
}
