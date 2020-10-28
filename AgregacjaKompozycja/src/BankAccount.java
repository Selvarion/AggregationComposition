public class BankAccount {
    private Person owner;
    private double balance;

    public BankAccount(Person owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner=" + owner +
                ", balance=" + balance +
                '}';
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}
