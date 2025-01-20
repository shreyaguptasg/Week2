package Level1;

public class BankAccount {

        String bankName = "Canara Bank";
        String accountHolderName;
        final int accountNumber;
        static int count;

        BankAccount(String var1, int var2) {
            this.accountHolderName = var1;
            this.accountNumber = var2;
        }

        static void getTotalAccounts() {
            ++count;
            System.out.println("count :" + count);
        }

        void display() {
            System.out.println("Bank Name is :" + this.bankName);
            System.out.println("Bank holder name is :" + this.accountHolderName);
            System.out.println("Bank account number is :" + this.accountNumber);
        }

        public static void main(String[] var0) {
            BankAccount var1 = new BankAccount("Shreya", 112345678);
            var1.display();
            if (var1 instanceof BankAccount) {
                System.out.println("account is an instance of BankAccount");
            } else {
                System.out.println("account is not an instance of BankAccount");
            }

        }


}
