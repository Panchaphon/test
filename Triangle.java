public class Triangle extends Shape {

    // attributes
    public String name;
    protected double base;
    protected double height;
    protected double perimeter;
    protected double side3;

    // default constructor
    public Triangle() {

    }

    public Triangle(double area) {
        this.area = area;
    }

    public Triangle(String name) {
        this.name = name;
    }

    public Triangle(String name, double base, double height, double side3) {
        this.name = name;
        this.base = base;
        this.height = height;

        this.side3 = side3;

    }

    // methods
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getSide3() {
        return side3;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calArea() {
        this.area = 0.5 * (base * height);
    }

    public double calArea(double base, double height) {
        return 0.5 * (base * height);
    }

    public void calPerimeter() {
        this.perimeter = base + height + side3;
    }

    public double calPerimeter(double base, double height, double side3) {
        return base + height + side3;
    }

    public void draw() {
        System.out.println("Draw a triangle with perimeter " + perimeter);
    }

    public void printInfo() {
        System.out.println("\n---- Print Triangle Info ----");
        System.out.println("Name: " + name);
        System.out.println("Base: " + base);
        System.out.println("Hight: " + height);
        System.out.println("Side3: " + side3);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}