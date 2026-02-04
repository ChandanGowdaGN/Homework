class Employee {
    String name;
    int salary;
}

class Developer extends Employee {
    void code() {
        System.out.println("Coding");
    }
}

class Manager extends Developer {
    void manageTeam() {
        System.out.println("Managing team");
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Ravi";
        m.salary = 50000;
        m.code();
        m.manageTeam();
    }
}
