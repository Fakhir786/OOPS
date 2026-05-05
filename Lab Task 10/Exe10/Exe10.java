
package exe10; //Fakhir Ashar Chaudhry 72990
import java.util.Scanner;
public class Exe10 {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in); //Fakhir Ashar Chaudhry 72990
     System.out.println("Entyer radius");
     double r=s.nextDouble();
     System.out.println("Entyer height"); //Fakhir Ashar Chaudhry 72990
     double h=s.nextDouble();
     Circle ci=new Circle(); //Fakhir Ashar Chaudhry 72990
     ci.draw();
     Cylinder c=new Cylinder();
     double result=c.calculateArea(r,h); //Fakhir Ashar Chaudhry 72990
     System.out.println("Area of cylinder is "+result);  
    }  
}
