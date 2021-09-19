package UMS;

public class Contact {
    private String email;
    private String phone;
    private Address address;

    public Contact(String email, String phone, Address address) {
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return ":" +
                "\n\t\tEmail='" + email +
                ",\n\t\tPhone='" + phone + '\'' +"\n" +
                "\t Address:" + address;
    }
}
