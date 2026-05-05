
package exe6;

class CheckingAccount extends BankAccount {
 
    void withdraw(double amount) {
        double fee = 15;
        double total = amount + fee;
        if (total > balance) {
            System.out.println("Insufficient funds! (Amount + $15 fee = $" + total + ")");
        } else {
            balance = balance - total;
            System.out.println("Withdrawn: $" + amount + " | Fee: $" + fee);
            System.out.println("Balance: $" + balance);
        }
    }
}