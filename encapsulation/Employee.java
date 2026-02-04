class Employee {
    private double salary;

    void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    double getSalary() {
        return salary;
    }
}
