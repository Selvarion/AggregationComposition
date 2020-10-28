public class Bank {
    public static void main(String[] args) {

        // adresy wyzerowane
        Address registeredAddress = null;
        Address livingAddress = null;

        // Pierwsza osoba
        Person person1 = new Person("Jan", "Kowalski", "90897812362",
                registeredAddress, livingAddress);

        //tworzymy adres
        Address address1 = new Address("Warszawa", "Woronicza", 22, 43, "20 - 222");

        //taki sam adres zamieszkania i zameldowania
        person1.setLivingAddress(address1);
        person1.setRegisteredAddress(address1);

        //pierwsze konto bankowe
        BankAccount account1 = new BankAccount( person1,10_000);

        // kredyt osoby1
        Credit credit1 = new Credit(person1, 5000, 0, 0.10,12);

        // druga osoba
        Person person2 = new Person("Marta", "Kowalaska", "90897812332", registeredAddress, livingAddress);
        Address address2 = new Address("Kraków", "Mickiewicza",15, 8, "30-333");


        // adres zameldowania oraz adrez zamieszkania w miejscu osoby1
        person2.setRegisteredAddress(address2);
        person2.setLivingAddress(person1.getLivingAddress());


        // drugie konto bankowe
        BankAccount account2 = new BankAccount(person2, 20_000);

        Person person3 = new Person("Jan", "Kowalski", "90897812369",
                registeredAddress, livingAddress);

        Address address3 = new Address("Kraków", "Żeromskiego",34, "30-333");
        person3.setRegisteredAddress(address2);
        person3.setLivingAddress(address3);


        System.out.println("Pierwsza osoba");
        System.out.println(person1.getFirstName() + " " + person1.getLastName());
        // wyswietlenie tylko miasta
        System.out.println("mieszka w miejscowosci: " + address1.getCity());
        System.out.println("posiada konto bankowe z kwotą: " + account1.getBalance());
        System.out.println("Posiada kredyt na: " + credit1.getCashBorrowed());

        System.out.println();

        System.out.println("Druga osoba");
        System.out.println(person2.getFirstName() + " " + person2.getLastName());
        //Wyswietlenie dokładnego adresu
        System.out.println("Dane zamieszkania: " + person2.getLivingAddress());
        System.out.println("posiada konto bankowe z kwotą: " + account2.getBalance());

        System.out.println("adres trzeciej osoby");
        System.out.println(address3);
    }
}
