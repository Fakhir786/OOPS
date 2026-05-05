package main; //Fakhir Ashar Chaudhry 72990
public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Abdullah", 101);//Fakhir Ashar Chaudhry 72990
        Accountant a = new Accountant("Ahmed", 102);
        Librarian l = new Librarian("Ali", 103);
        t.display(); //Fakhir Ashar Chaudhry 72990
        t.teach();
        a.display();
        a.manageAccounts(); //Fakhir Ashar Chaudhry 72990
        l.display();
        l.manageLibrary();
    } //Fakhir Ashar Chaudhry 72990
}
