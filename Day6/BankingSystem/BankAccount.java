package BankingSystem;
//Create a banking system with different account types:
//Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
abstract class BankAccount implements Lonable {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
         this.balance=balance;
    }

    //concerte methods
    public double deposit(double amount){
        if(amount>0)
            setBalance(this.balance+amount);
        return getBalance();
    }
    public double withdraw(double amount){
        if(balance>0 && amount <balance)
        return this.balance= this.balance-amount;
        else{
            return 0.0;
        }
    }
    public void display(){
        System.out.println("Account number : "+this.getAccountNumber());
        System.out.println("Holder name : "+this.getHolderName());
        System.out.println("balance :" +this.getBalance());
    }

    //abstract method
    abstract public double calculateInterest();

    //implemeting interface methods


    @Override
    public void applyForLoan() {
        if(this.balance>1000){
            System.out.println("You can apply for loan");
        }
        else{
            System.out.println("Do not have enough balance to apply for loan");
        }
    }

    @Override
    public void calculateLoanEligibility(){
        if(this.balance>1000){
            System.out.println("you can have loan of 100 rupees");
        }
        else if(this.balance<1000 && this.balance>800){
            System.out.println("you can have loan of 80 rupees");
        }
        else{
            System.out.println("you can have loan of 50 rupees ");
        }

    }
}
