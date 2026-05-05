
package exe6;

public class Exe6 {
    public static void main(String[] args) {
 
        // Savings Account Test
        System.out.println("===== Savings Account =====");
        SavingAccount sa = new SavingAccount();
        sa.accountHolder = "Ali";
        sa.balance = 1000;
        sa.display();
 
        System.out.println("\n-- Deposit $200 --");
        sa.deposit(200);
 
        System.out.println("\n-- Withdraw $400 (OK) --");
        sa.withdraw(400);
 
        System.out.println("\n-- Withdraw $600 (Exceeds limit) --");
        sa.withdraw(600);
 
        System.out.println("\n-- Withdraw $700 (Breaks min balance) --");
        sa.withdraw(700);
 
 
        // Checking Account Test
        System.out.println("\n===== Checking Account =====");
        CheckingAccount ca = new CheckingAccount();
        ca.accountHolder = "Sara";
        ca.balance = 500;
        ca.display();
 
        System.out.println("\n-- Withdraw $100 (+ $15 fee) --");
        ca.withdraw(100);
 
        System.out.println("\n-- Withdraw $400 (Not enough with fee) --");
        ca.withdraw(400);
    }
}
