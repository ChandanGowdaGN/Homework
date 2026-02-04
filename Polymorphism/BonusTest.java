class Employee {
    void calculateBonus() {
        System.out.println("Employee bonus");
    }
}

class Developer extends Employee {
    void calculateBonus() {
        System.out.println("Developer bonus: 10000");
    }
}

class Manager extends Employee {
    void calculateBonus() {
        System.out.println("Manager bonus: 20000");
    }
}

public class BonusTest {
    public static void main(String[] args) {

        Employee e;

        e = new Developer();
        e.calculateBonus();

        e = new Manager();
        e.calculateBonus();
    }
}
