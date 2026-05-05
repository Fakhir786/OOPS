package main;             
class Accountant extends Staff {
    Accountant(String n, int i) {             
        super(n, i);
    }             
    void manageAccounts() {
        System.out.println(name + " is managing accounts.");
    }            
}
