
package exe9;//Fakhir Ashar Chaudhry 72990
public class Exe9 {
    public static void main(String[] args) {  
        SavingsAccount s1 = new SavingsAccount();
        CurrentAccount c1 = new CurrentAccount();//Fakhir Ashar Chaudhry 72990
        s1.setData("Abdullah", 201, 2000000);
        c1.setData("Ali", 202, 10000000);//Fakhir Ashar Chaudhry 72990
        s1.deposit(500);//Fakhir Ashar Chaudhry 72990
        s1.withdraw(1800);
        s1.displayInfo();//Fakhir Ashar Chaudhry 72990
        c1.deposit(1000);
        c1.withdraw(2500);//Fakhir Ashar Chaudhry 72990
        c1.displayInfo();//Fakhir Ashar Chaudhry 72990
    }    
}
