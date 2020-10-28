public class Credit {
    private Person borrower;
    private double cashBorrowed;
    private double cashReturend;
    private double interestRate;
    private int termMonths;

    public Credit(Person borrower, double cashBorrowed, double cashReturend, double interestRate, int termMonths) {
        this.borrower = borrower;
        this.cashBorrowed = cashBorrowed;
        this.cashReturend = cashReturend;
        this.interestRate = interestRate;
        this.termMonths = termMonths;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "borrower=" + borrower +
                ", cashBorrowed=" + cashBorrowed +
                ", cashReturend=" + cashReturend +
                ", interestRate=" + interestRate +
                ", termMonths=" + termMonths +
                '}';
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public void setCashBorrowed(double cashBorrowed) {
        this.cashBorrowed = cashBorrowed;
    }

    public void setCashReturend(double cashReturend) {
        this.cashReturend = cashReturend;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }

    public Person getBorrower() {
        return borrower;
    }

    public double getCashBorrowed() {
        return cashBorrowed;
    }

    public double getCashReturend() {
        return cashReturend;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTermMonths() {
        return termMonths;
    }
}
