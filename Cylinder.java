public class Cylinder extends Circle {

    // attributes
    public double high;
    protected double volume;

    // default constructor
    public Cylinder() {
    }

    public Cylinder(double radius) {
        this.radius = radius;
    }

    public Cylinder(String name) {
        this.name = name;
    }

    public Cylinder(String name, double radius, double high) {
        this.name = name;
        this.radius = radius;
        this.high = high;
    }

    // methods

    public double getHigh() {
        return high;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calArea() {
        this.area = (2 * Math.PI * radius * high) + (2 * Math.PI * (radius * radius));
    }

    public double calArea(double radius, double high) {
        return ((2 * Math.PI) * radius * high) + (2 * Math.PI * (radius * radius));
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void calVolume() {
        this.volume = (Math.PI * (radius * radius) * high);
    }

    public double calVolume(double radius, double high) {
        return (Math.PI * (radius * radius) * high);
    }

    public void draw() {
        System.out.println("Draw a cylinder with volume " + volume);
    }

    public void printInfo() {
        System.out.println("\n---- Print Cylinder Info ----");
        System.out.println("Name: " + name);
        System.out.println("Radius: " + radius);
        System.out.println("High: " + high);
        System.out.println("Volume: " + volume);
        System.out.println("Area: " + area);
    }
}