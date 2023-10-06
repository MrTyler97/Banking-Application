package BankAccount;

class BusinessAccount extends BankAccount {
    public BusinessAccount(double x){
        super(x);
    }
    @Override
    public double withdraw(double f){
        if(balance - f >= 1000){
            balance -= f;
        }
        return balance;
    }
    @Override
    public String getAccountType(){
        return "Business Account";
    }
}
