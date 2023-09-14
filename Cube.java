public class Cube extends Square {

    // attributes
    public double high;
    protected double volume;
    protected double side;

    // default constructor
    public Cube() {
    }

    public Cube(String name) {
        this.name = name;
    }

    public Cube(String name, double side) {
        this.name = name;
        this.side = side;
    }

    // methods
    public double getHigh() {
        return high;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public double getSide() {
        return side;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calArea() {
        this.area = 6 * (side * side);
    }

    public double calArea(double side) {
        return 6 * (side * side);
    }

    public void calVolume() {
        this.volume = side * side * side;
    }

    public double calVolume(double side) {
        return side * side * side;
    }

    public void draw() {
        System.out.println("Draw a cube with volume " + volume);
    }

    public void printInfo() {
        System.out.println("\n---- Print Cube Info ----");
        System.out.println("Name: " + name);
        System.out.println("Side: " + side);
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }
}