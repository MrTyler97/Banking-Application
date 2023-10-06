package BankAccount;

class FixedDepositAccount extends BankAccount {
    int term;
    boolean termFinished = false;

    public FixedDepositAccount(double x, int y) {
        super(x);
        this.term = y;
    }

    @Override
    public double withdraw(double f) {
        if (this.term >= 1) {
            termFinished = true;
            if (termFinished) {
                balance -= f;
            }
        }
        return balance;
    }
    @Override
    public String getAccountType(){
        return "Fixed Deposit Account";
    }
}
