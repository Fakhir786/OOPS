
package shape;//Fakhir Ashar Chaudhry 72990

public class Shape {//Fakhir Ashar Chaudhry 72990
    void area(int side) {
        int result = side * side;
        System.out.println("Area of square: " + result);//Fakhir Ashar Chaudhry 72990
    }

    void area(int length, int width) {
        int result = length * width;
        System.out.println("Area of rectangle: " + result);//Fakhir Ashar Chaudhry 72990
    }

    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of circle: " + result);//Fakhir Ashar Chaudhry 72990
    }

    public static void main(String[] args) {//Fakhir Ashar Chaudhry 72990
        Shape obj = new Shape();
        obj.area(5);         
        obj.area(10, 4);      
        obj.area(3.5);     //Muhammad Abdullah   73052
    }
}
