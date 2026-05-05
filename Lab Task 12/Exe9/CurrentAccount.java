
package exe9;//Fakhir Ashar Chaudhry 72990
public class CurrentAccount extends BankAccount{
       double overdraftLimit = 1000;//Fakhir Ashar Chaudhry 72990
    void deposit(double amount) {
        balance += amount;//Fakhir Ashar Chaudhry 72990
        System.out.println("Deposited in Current: " + amount);//Fakhir Ashar Chaudhry 72990
    }
    void withdraw(double amount) {//Fakhir Ashar Chaudhry 72990
        if (balance + overdraftLimit >= amount) {
            balance -= amount;//Fakhir Ashar Chaudhry 72990
            System.out.println("Withdrawn from Current: " + amount);
        } else {//Fakhir Ashar Chaudhry 72990
            System.out.println("Withdrawal exceeds overdraft limit!");
}
    }
}
