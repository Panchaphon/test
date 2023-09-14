public class Rectangle extends Shape {

    // attributes
    protected double perimeter;
    protected double length;
    protected double width;

    // default constructor
    public Rectangle() {

    }

    public Rectangle(double area) {
        this.area = area;
    }

    public Rectangle(String name) {
        this.name = name;
    }

    public Rectangle(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public Rectangle(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    // methods
    public double getWidth() {
        return width;
    }

    public double getlength() {
        return length;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void calArea() {
        this.area = length * width;
    }

    public double calArea(double lenght, double width) {
        return area = lenght * width;
    }

    public void calPerimeter() {
        this.perimeter = 2 * length * width;
    }

    public double calPerimeter(double lenght, double width) {
        return 2 * lenght * width;
    }

    public void draw() {
        System.out.println("Draw a rectangle with area " + area);
    }

    public void printInfo() {
        System.out.println("\n---- Print Rectangle Info----");
        System.out.println("Name: " + name);
        System.out.println("lenght: " + length);
        System.out.println("width: " + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

}