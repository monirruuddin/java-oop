package UMS;

public class Guardian extends  Person{
    private String professonal;
    private double income;


    public Guardian(String name, String professonal, double income) {
        super(name);
        this.professonal = professonal;
        this.income = income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getProfessonal() {
        return professonal;
    }

    public void setProfessonal(String professonal) {
        this.professonal = professonal;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }


    @Override
    public String toString() {
        return "Guardian:" + "\n" +
                super.toString() + "\n" +
                "\t Professonal=" + professonal + "\n" +
                "\t Income=" + income;
    }
}
