
package exe8;//Fakhir Ashar Chaudhry 72990
public class Programmer extends Employee{
   
    int hoursWorked;
    double hourlyRate;//Fakhir Ashar Chaudhry 72990
    void setData(String n, int i, int h, double rate) {
        name = n;
        id = i;
        hoursWorked = h;//Fakhir Ashar Chaudhry 72990
        hourlyRate = rate;
    }
     @Override
    void calculateSalary() {
        salary = hoursWorked * hourlyRate;//Fakhir Ashar Chaudhry 72990
    }
       @Override
    void displayInfo() {
        System.out.println("Programmer Info:");//Fakhir Ashar Chaudhry 72990
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);//Fakhir Ashar Chaudhry 72990
    }
}


