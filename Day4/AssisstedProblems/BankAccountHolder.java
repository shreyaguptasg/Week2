package AssisstedProblems;

//Define a AssisstedProblems.Library class with an ArrayList of Book objects.
//Define a Book class with attributes such as title and author.
//Demonstrate the aggregation relationship by creating books and adding them to different libraries.
class Bank{
     static String bankName="SBI";
     public void openAccount(Customer c){
         System.out.println("Welcome to SBI " + c.getName());
     }
}
class Customer{
    private String customerName;
    private int balance;
    Customer(String customerName, int balance){
    this.customerName=customerName;
    this.balance = balance;
    }
    public String getName(){
    return this.customerName;

    }
    public void viewBalance(){
        System.out.println("The balance of " + this.customerName + " is :" +this.balance);
    }
}
class BankAccountHolder{
        public static void main(String[] args) {
        Customer customer = new Customer("Ram", 9000);
        Bank bank = new Bank();
        bank.openAccount(customer);
        customer.viewBalance();
    }
}
