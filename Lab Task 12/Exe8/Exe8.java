
package exe8;//Fakhir Ashar Chaudhry 72990
public class Exe8 {
    public static void main(String[] args) {//Fakhir Ashar Chaudhry 72990
       
        Manager m = new Manager();//Fakhir Ashar Chaudhry 72990
        m.setData("Ali", 101, 10000);
        m.calculateSalary();
        m.displayInfo();//Fakhir Ashar Chaudhry 72990
        System.out.println();
        Programmer p = new Programmer();
        p.setData("Ahmed", 102, 40, 500);//Fakhir Ashar Chaudhry 72990
        p.calculateSalary();
        p.displayInfo();//Fakhir Ashar Chaudhry 72990
    }
    
}
