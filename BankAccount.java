package BankAccount;

abstract class BankAccount {
    double balance;
    public abstract double withdraw(double x);
    public abstract String getAccountType();

    public BankAccount() {
    }

    public BankAccount(double x) {
        this.balance = x;
    }

    public void deposit(double d) {
        this.balance += d;
    }
}
