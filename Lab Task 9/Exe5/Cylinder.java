
package exe5;//Fakhir Ashar Chaudhry 72990
class Cylinder extends Shape {
    private double radius;
    private double height;//Fakhir Ashar Chaudhry 72990
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;//Fakhir Ashar Chaudhry 72990
    }
    public double getRadius() { return radius; }//Fakhir Ashar Chaudhry 72990
    public double getHeight() { return height; }

    public void draw() {//Fakhir Ashar Chaudhry 72990
        System.out.println("Drawing Cylinder:");
        System.out.println("    _______  ");
        System.out.println("   /       \\   ");
        System.out.println("  |         |  ");//Fakhir Ashar Chaudhry 72990
        System.out.println("  |         |  ");
        System.out.println("  |         |  ");//Fakhir Ashar Chaudhry 72990
        System.out.println("   \\_______/   ");
        System.out.println("Radius: " + radius + ", Height: " + height);
    }
    public double calculateArea() {//Fakhir Ashar Chaudhry 72990
        return 2 * Math.PI * radius * (radius + height);
    }
}
