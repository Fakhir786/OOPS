
package exe6;

class SavingAccount extends BankAccount {
 
    void withdraw(double amount) {
        if (amount > 500) {
            System.out.println("Cannot withdraw more than $500 at a time!");
        } else if ((balance - amount) < 100) {
            System.out.println("Minimum balance of $100 must be maintained!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Balance: $" + balance);
        }
    }
}
