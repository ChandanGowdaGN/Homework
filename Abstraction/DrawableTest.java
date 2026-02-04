interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Triangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class DrawableTest {
    public static void main(String[] args) {

        Drawable d;

        d = new Circle();
        d.draw();

        d = new Triangle();
        d.draw();
    }
}
