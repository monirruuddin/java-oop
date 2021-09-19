package UMS;

public class Uniperson extends Person {
    private Department department;

    public Uniperson(String name, Department department) {
        super(name);
        this.department = department;
    }

    public Uniperson(String name) {
        super(name);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.getName() +
                "\n" + department;
    }


}
