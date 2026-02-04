class Area {

    void area(int side) {
        System.out.println("Square Area: " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Rectangle Area: " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Area a = new Area();

        a.area(5);          // square
        a.area(4, 6);       // rectangle
        a.area(3.0);        // circle
    }
}
