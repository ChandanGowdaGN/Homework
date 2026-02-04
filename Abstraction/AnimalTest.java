abstract class Animal {

    abstract void sound();   // abstract method

    void eat() {             // normal method
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.eat();
        a.sound();

        a = new Cat();
        a.eat();
        a.sound();
    }
}
