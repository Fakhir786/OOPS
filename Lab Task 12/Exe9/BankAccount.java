
package exe9;//Fakhir Ashar Chaudhry 72990
public abstract class BankAccount {
     String accountHolder;
    int accountNumber;//Fakhir Ashar Chaudhry 72990
    double balance;
    void setData(String name, int accNo, double bal) {//Fakhir Ashar Chaudhry 72990
        accountHolder = name;
        accountNumber = accNo;//Fakhir Ashar Chaudhry 72990
        balance = bal;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);//Fakhir Ashar Chaudhry 72990

    void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);//Fakhir Ashar Chaudhry 72990
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

        
    }
}


