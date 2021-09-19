package UMS;

public class Subject {
    private String name;
    private double credit;

    public Subject(String name, double credit) {
        this.name = name;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return  "\n" +
                "\t\tname='" + name + '\'' + "\n" +
                "\t\tcredit=" + credit;
    }
}
