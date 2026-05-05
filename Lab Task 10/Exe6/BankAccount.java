
package exe6;

class BankAccount {
    String accountHolder;
    double balance;
 
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("Balance: $" + balance);
    }
 
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Balance: $" + balance);
        }
    }
 
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}