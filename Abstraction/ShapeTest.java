abstract class Shape {

    abstract void area();   // abstract method

    void display() {        // normal method
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        int r = 5;
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 4, b = 6;
        System.out.println("Rectangle Area: " + (l * b));
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.display();
        s1.area();

        s2.display();
        s2.area();
    }
}
