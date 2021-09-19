package UMS;

import java.util.UUID;

public class Person {
    private String name;
    private String blood;
    private Contact contact;

    public Person(String name, String blood, Contact contact) {
        this.name = name;
        this.blood = blood;
        this.contact = contact;
    }

    public Person(String name) {
        this.name = name;
    }
    public Person(Contact contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return  "\t name=" + name + "\n" +
                "\t blood=" + blood + "\n" +
                "\t contact:" + contact;
    }
}
