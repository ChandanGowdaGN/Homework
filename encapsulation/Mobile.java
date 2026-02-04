class Mobile {
    private int batteryLevel = 50;

    void charge(int amount) {
        if (batteryLevel + amount <= 100) {
            batteryLevel += amount;
        }
    }

    void use(int amount) {
        if (batteryLevel - amount >= 0) {
            batteryLevel -= amount;
        }
    }

    int getBatteryLevel() {
        return batteryLevel;
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.charge(20);
        m.use(10);
        System.out.println(m.getBatteryLevel());
    }
}
