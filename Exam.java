package UMS;

public class Exam {
    private String name;
    private double passmark;
    private Subject subject;

    public Exam(String name, double passmark, Subject subject) {
        this.name = name;
        this.passmark = passmark;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPassmark() {
        return passmark;
    }

    public void setPassmark(double passmark) {
        this.passmark = passmark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "\t\t\n\n Exam: \n" +
                "\t\tname='" + name + '\'' + "\n" +
                "\t\tpassmark=" + passmark + "\n" +
                "\t\t\n\nsubject:" + subject + "\n";
    }
}
