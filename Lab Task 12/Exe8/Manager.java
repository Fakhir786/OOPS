
package exe8;//Fakhir Ashar Chaudhry 72990
public class Manager extends Employee {
     double bonus;//Fakhir Ashar Chaudhry 72990
    void setData(String n, int i, double b) {
        name = n;
        id = i;//Fakhir Ashar Chaudhry 72990
        bonus = b;
    }

    @Override
    void calculateSalary() {//Fakhir Ashar Chaudhry 72990
        salary = 50000 + bonus;  
    }
    @Override
    void displayInfo() {//Fakhir Ashar Chaudhry 72990
        System.out.println("Manager Info:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);//Fakhir Ashar Chaudhry 72990
        System.out.println("Salary: " + salary);
    }
}

