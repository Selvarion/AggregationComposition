public class Address {
    private String city;
    private String street;
    private int home;
    private int flat;
    private String postalCode;

    public Address(String city, String street, int home, int flat, String postalCode) {
        this(city, street, home, postalCode);
        this.flat = flat;
    }

    public Address(String city, String street, int home, String postalCode) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address: " +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", home=" + home +
                ", flat=" + flat +
                ", postalCode='" + postalCode + '\'';
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getFlat() {
        return flat;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
