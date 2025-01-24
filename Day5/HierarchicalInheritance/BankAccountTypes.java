package HierarchicalInheritance;
// Model a banking system with different account types using hierarchical inheritance.
// BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
//Define a base class BankAccount with attributes like accountNumber and balance.
class BankAccount{
    protected int accountNumber;
    protected int balance;
    BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance= balance;
    }
    public void displayAccountType(){
        System.out.println("Account Number is : " + this.accountNumber);
        System.out.println("Balance is : " + this.balance);

    }
}
//Define subclasses SavingsAccount with unique attributes like interestRate for SavingsAccount
class SavingsAccount extends BankAccount{
    protected int interestRate;
   SavingsAccount(int accountNumber, int balance, int interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    @Override
    public void displayAccountType(){
        super.displayAccountType();
        System.out.println("Interest Rate is : " + this.interestRate);

    }
}
//Define subclasses FixedDepositAccount unique attributes like  withdrawalLimit for CheckingAccount.
class CheckingAccount extends BankAccount{
    protected int withdrawalLimit;
    CheckingAccount(int accountNumber, int balance, int withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit =withdrawalLimit;
    }
    @Override
    public void displayAccountType(){
        super.displayAccountType();
        System.out.println("WithdrawalLimit is : " + this.withdrawalLimit);

    }
}
//Define a subclass FixedDepositAccount with attribute isFixedAccount
class FixedDepositAccount extends BankAccount{
    protected boolean isFixedAccount;
    FixedDepositAccount(int accountNumber, int balance, boolean isFixedAccount){
        super(accountNumber,balance);
        this.isFixedAccount =isFixedAccount;
    }
    @Override
    public void displayAccountType(){
        super.displayAccountType();
        System.out.println("FixedDepositAccount is : " + this.isFixedAccount);

    }
}
public class BankAccountTypes {
    public static void main(String[] args) {
        //creating object of superclass and subclass
        BankAccount bankAccount = new BankAccount(4478443, 70000);
        SavingsAccount savingsAccount = new SavingsAccount(6546377, 90000, 8);
        CheckingAccount checkingAccount = new CheckingAccount(646383,70000, 2000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(67466431, 4000000, true);
        //calling out their respective methods
        bankAccount.displayAccountType();
        savingsAccount.displayAccountType();
        checkingAccount.displayAccountType();
        fixedDepositAccount.displayAccountType();
    }
}
