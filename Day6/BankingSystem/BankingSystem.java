package BankingSystem;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savingAccount = new SavingsAccount("24879744", "Aunrag" , 800000,0.08);
        BankAccount currentAccount = new CurrentAccount("38746464", "Roshan", 9, 0.02);
        savingAccount.deposit(800);
        savingAccount.withdraw(70);
        currentAccount.withdraw(90);
        currentAccount.deposit(9);
        savingAccount.calculateInterest();
        currentAccount.calculateInterest();
        savingAccount.applyForLoan();
        savingAccount.calculateLoanEligibility();
        currentAccount.applyForLoan();
        currentAccount.calculateLoanEligibility();
    }
}
