
package exe9;


 class SavingsAccount extends BankAccount {
   
    double minBalance = 500;
//Fakhir Ashar Chaudhry 72990
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Savings: " + amount);
    }

    void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;//Fakhir Ashar Chaudhry 72990
            System.out.println("Withdrawn from Savings: " + amount);
        } 
        else {//Fakhir Ashar Chaudhry 72990
            System.out.println("Cannot withdraw! Minimum balance must be maintained.");
}
    }
 }

