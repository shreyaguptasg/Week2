package BankingSystem;

public class CurrentAccount extends BankAccount{
    double interestRate;
    CurrentAccount(String accountNumber, String holderName, double balance, double interestRate){
        super(accountNumber,holderName,balance);
        this.interestRate=interestRate;
    }
    @Override
    public double calculateInterest() {
        return interestRate*getBalance();
    }
    @Override
    public void display(){
        super.display();
    }
}
