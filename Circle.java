public class Circle extends Shape {

    // attributes
    protected double radius;
    protected double circumference;
    protected double diameter;

    // default constructor
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String name) {
        this.name = name;
    }

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    // methods
    public double getRadius() {
        return radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calArea() {
        this.area = Math.PI * radius * radius;
    }

    public double calArea(double radius) {
        return Math.PI * radius * radius;
    }

    public void setCircum(double circumference) {
        this.circumference = circumference;
    }

    public void calCircum() {
        this.circumference = 2 * Math.PI * radius;
    }

    public double calCircum(double radius) {
        return circumference;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void calDiameter() {
        this.diameter = radius * radius;
    }

    public double calDiameter(double radius) {
        return radius * radius;
    }

    public void draw() {
        System.out.println("Draw a circle with radius " + radius);
    }

    public void printInfo() {
        System.out.println("\n---- Print Circle Info ----");
        System.out.println("Name: " + name);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        System.out.println("Diameter: " + diameter);
    }

}