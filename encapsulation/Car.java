class Car {
    private int speed;

    void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(120);
        System.out.println("Speed set");
    }
}
