package UMS;

import java.util.UUID;

public class Employee extends Uniperson{
    private double salary;

    public Employee( String name, double salary) {

        super(name);
        this.salary = salary;
    }

    public Employee(String name) {
        super(name);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "\t\tName:" + super.getName() + "\n" +
                "\t\tSalary=" + salary;
    }
}
