package co.g2academy.oop;

public class Salary extends Employee {
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }
    public String mailCheck() {
        return "Within mailCheck of Salary class. " + super.mailCheck();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0)
        this.salary = newSalary;
    }
    public double computePay() {
        return salary / 52;
    }
}
