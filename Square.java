public class Square extends Shape {

    // attributes
    protected double width;
    protected double height;

    // default constructor
    public Square() {

    }

    public Square(String name) {
        this.name = name;
    }

    public Square(String name, double width, double height) {

        this.name = name;
        this.width = width;
        this.height = height;
    }

    // methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void calArea() {
        this.area = width * height;
    }

    public double calArea(double width, double height) {
        return width * height;
    }

    public void draw() {
        System.out.println("Draw a square with width = " + width +
                " and height = " + height);
    }

    public void printInfo() {
        System.out.println("\n---- Print Square Info----");
        System.out.println("Name: " + name);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);

    }
}