package BankAccount;

class CheckingAccount extends BankAccount {
    double overdraft;

    public CheckingAccount(double x, double y) {
        super(x);
        this.overdraft = y;
    }

    @Override
    public double withdraw(double f) {
        if (f <= balance + overdraft) {
            balance -= f;
        }
        return balance;
    }
    @Override
    public String getAccountType(){
        return "Checking Account";
    }
}