package BankAccount;

class StudentAccount extends BankAccount {
    public StudentAccount(double x) {
        super(x);
    }

    @Override
    public double withdraw(double f) {
        if (f <= 500 || balance - f > balance) {
            balance -= f;
        }
        return balance;
    }

    @Override
    public String getAccountType() {
        return "Student Account";
    }

}
