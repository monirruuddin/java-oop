package UMS;

public class Teacher extends Employee{
    private String subject;

    public Teacher(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    @Override
    public String toString() {
        return  "\n" +
                super.toString() + "\n" +
                "\t\tSubject='" + subject;
    }
}
