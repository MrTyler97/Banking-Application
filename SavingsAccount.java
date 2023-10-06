package BankAccount;

class SavingsAccount extends BankAccount {
    public SavingsAccount(double x){
        super(x);
    }
    @Override
    public double withdraw(double w) {
        if (balance >= w) {
            balance -= w;
        }
        return balance;
    }
    @Override
    public String getAccountType(){
        return "Savings Account";
    }
}
