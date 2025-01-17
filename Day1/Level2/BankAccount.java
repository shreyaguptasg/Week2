import java.util.*;
//creating a class BankAccount
class BankAccount{
	 //defining attributes such as accountHolder, accountNumber, and balance
	String accountHolder;
    String	accountNumber;
	int balance;
	
	//creating constructor of the class BankAccount

	BankAccount(String accountHolder, String accountNumber, int balance){
		this.accountHolder= accountHolder;
		this.accountNumber = accountNumber;
		this.balance= balance;
	}
	//method to deposit the money in the account
	public int depositMoney(int deposting_amt){
		balance = balance+deposting_amt;
		System.out.println("The balance after deposting " + deposting_amt + " is " +balance);
		return balance;
	}
	
	//method to withdraw money
	public int withdrawMoney(int withdrawing_amt){
		if(balance>withdrawing_amt){
			balance=  balance - withdrawing_amt;
		}
		else{
			balance =0;
		}
		System.out.println("The balance after withdrawing" + withdrawing_amt + " is " +balance);
		return balance;
	}
	
	//method to display current balance
	public void displayBalance(){
		System.out.println("The current balance in the account is " +balance);
	}
	
	
	
	
	
	

	public static void main(String [] args){
		//creating an object of the class BankAccount and displaying the results.

		BankAccount account1 = new BankAccount("Shreya", "123456712", 300);
		account1.depositMoney(5000);
		account1.withdrawMoney(10);
		account1.displayBalance();
		
	}
}