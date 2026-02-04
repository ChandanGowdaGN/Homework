abstract class Employee {

    abstract void calculateSalary();   // abstract method
}

class FullTimeEmployee extends Employee {
    void calculateSalary() {
        int basic = 30000;
        System.out.println("Full Time Salary: " + basic);
    }
}

class PartTimeEmployee extends Employee {
    void calculateSalary() {
        int hours = 20;
        int rate = 500;
        System.out.println("Part Time Salary: " + (hours * rate));
    }
}

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e;

        e = new FullTimeEmployee();
        e.calculateSalary();

        e = new PartTimeEmployee();
        e.calculateSalary();
    }
}
