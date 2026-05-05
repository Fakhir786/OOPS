
package exe5;//Fakhir Ashar Chaudhry 72990

class Circle extends Shape {

    private double radius;
//Fakhir Ashar Chaudhry 72990
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {//Fakhir Ashar Chaudhry 72990
        return radius;
    }

    public void draw() {
        System.out.println("Drawing Circle:");
        System.out.println("     * * *     ");
        System.out.println("   *       *   ");//Fakhir Ashar Chaudhry 72990
        System.out.println("  *         *  ");
        System.out.println("   *       *   ");
        System.out.println("     * * *    ");//Fakhir Ashar Chaudhry 72990
        System.out.println("Radius: " + radius);
    }

    public double calculateArea() {
        return Math.PI * radius * radius;//Fakhir Ashar Chaudhry 72990
    }
}
