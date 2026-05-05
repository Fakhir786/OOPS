
package exe5;//Fakhir Ashar Chaudhry 72990

public class Exe5{

 public static void main(String[] args) {//Fakhir Ashar Chaudhry 72990

        Circle circle = new Circle(5.0);
        System.out.println("===CIRCLE===");//Fakhir Ashar Chaudhry 72990
        circle.draw();
        System.out.printf("Area of Circle     : %.2f sq units%n%n",//Fakhir Ashar Chaudhry 72990
                           circle.calculateArea());

        System.out.println("--------------------------------------------");//Fakhir Ashar Chaudhry 72990

        // Cylinder object
        Cylinder cylinder = new Cylinder(5.0, 10.0);//Fakhir Ashar Chaudhry 72990
        System.out.println("===CYLINDER===");
        cylinder.draw();
        System.out.printf("Total Surface Area : %.2f sq units%n",
                           cylinder.calculateArea());//Fakhir Ashar Chaudhry 72990
    }
}
