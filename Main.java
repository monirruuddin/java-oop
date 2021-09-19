package UMS;

public class Main {
    public static void main(String[] args) {

        Guardian guardian1 = new Guardian("Jalal Ahmed","Businessman",50000);
        guardian1.setBlood("A+");
        guardian1.setContact( new Contact("jalal@gmail.com","018555521",new Address("2B","Dhaka City","dhaka","BD")));
//        System.out.println(guardian1);
        // End Guardian 1 --------------------


        Student student1 = new Student("Monir Uddin",new Guardian(guardian1.getName(), guardian1.getProfessonal(), guardian1.getIncome()),new Exam("Mid-Term",40,new Subject("Economics",4)) ,5000);
        student1.getGuardian().setContact(new Contact("mm@gmail.com","018522",new Address("1B","Chittagong City","Ctg","Bangladesh")));

        student1.getGuardian().setBlood(guardian1.getBlood());
//        System.out.println(student1);
        // End Student 1 --------------------

        Department department1 = new Department("Arts Faculty",new Subject("English",3.5));
        student1.setDepartment(department1);

        // End department 1 --------------------

        Teacher teacher1 = new Teacher("Nayeem",100000, "Programming");
//        student1.getDepartment() = department1.setTeacher(teacher1);
        department1.setTeacher(teacher1);

        System.out.println(student1);

//
    }
}
