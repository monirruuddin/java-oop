package UMS;

public class Department {
    private String name;
    private Subject subjects;
    private Teacher teacher;

    public Department(String name, Subject subjects, Teacher teacher) {
        this.name = name;
        this.subjects = subjects;
        this.teacher = teacher;
    }
    public Department(String name, Subject subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject subjects) {
        this.subjects = subjects;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Department:" + "\n" +
                "\tname='" + name + "\n" +
                "\tsubjects=" + subjects + "\n" +
                "\t teacher=" + teacher;
    }
}

