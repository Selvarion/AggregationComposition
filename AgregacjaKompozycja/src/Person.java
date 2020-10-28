public class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    private Address registeredAddress;
    private Address livingAddress;

    public Person(String firstName, String lastName, String pesel, Address registeredAddress, Address livingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.registeredAddress = registeredAddress;
        this.livingAddress = livingAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", registeredAddress=" + registeredAddress +
                ", livingAddress=" + livingAddress +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setRegisteredAddress(Address registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public void setLivingAddress(Address livingAddress) {
        this.livingAddress = livingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public Address getRegisteredAddress() {
        return registeredAddress;
    }

    public Address getLivingAddress() {
        return livingAddress;
    }
}
