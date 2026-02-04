class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
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

        a = new Dog();   // parent reference, child object
        a.sound();      // Dog's sound()

        a = new Cat();   // parent reference, another child
        a.sound();      // Cat's sound()
    }
}
