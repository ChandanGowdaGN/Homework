class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle {
    String fuelType;

    Car() {
        super("Honda", 120);
        fuelType = "Petrol";
    }

    void display() {
        System.out.println(brand);
        System.out.println(speed);
        System.out.println(fuelType);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
