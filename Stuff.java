package UMS;

public class Stuff extends Employee{
    private String title;

    public Stuff(String name, double salary, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "title='" + title + '\'' +
                '}';
    }
}
