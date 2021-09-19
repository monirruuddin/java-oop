package UMS;

import java.util.Arrays;

public class Student extends Uniperson{
    private Guardian guardian;
    private Exam exam;
    private double fee;

    public Student(String name, Guardian guardian, Exam exam, double fee) {
        super(name);
        this.guardian = guardian;
        this.exam = exam;
        this.fee = fee;
    }

    public Guardian getGuardian() {
        return guardian;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student:\n" +
                "\tName:" +  super.toString() +  "\n"+
                 "\t" + guardian +
                "exam:" + exam +
                "\t\tfee=" + fee;
    }


}
