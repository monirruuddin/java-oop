package UMS;

public class Address {
    private String roadno;
    private String city;
    private String regoin;
    private String country;

    public Address(String roadno, String city, String regoin, String country) {
        this.roadno = roadno;
        this.city = city;
        this.regoin = regoin;
        this.country = country;
    }

    public String getRoadno() {
        return roadno;
    }

    public void setRoadno(String roadno) {
        this.roadno = roadno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegoin() {
        return regoin;
    }

    public void setRegoin(String regoin) {
        this.regoin = regoin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "\n\t\troadno='" + roadno + '\'' +
                "\n\t\tcity='" + city + '\'' +
                "\n\t\tregoin='" + regoin + '\'' +
                "\n\t\tcountry='" + country;
    }
}
