class Shape {
    String color = "Red";
}

class Circle extends Shape {
    void calculateArea() {
        int r = 5;
        System.out.println("Circle Area: " + (3.14 * r * r));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Color: " + c.color);
        c.calculateArea();
    }
}

class Rectangle extends Shape {
    void calculateArea() {
        int l = 4, b = 6;
        System.out.println("Rectangle Area: " + (l * b));
    }
}
