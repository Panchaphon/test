public class Box extends Rectangle {

    // attributes
    protected double height;
    protected double volume;
    protected double width;

    // default constructor
    public Box() {

    }

    public Box(String name) {
        this.name = name;
    }

    public Box(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public Box(String name, double length, double height, double width) {
        this.name = name;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    // methods
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void calVolume() {
        this.volume = length * width * height;
    }

    public double calVolume(double lenght, double width, double height) {
        return lenght * width * height;
    }

    public void draw() {
        System.out.println("Draw a box with volume " + volume);
    }

    public void calArea() {
        this.area = width * length * height;
    }

    public double calArea(double width, double height, double length) {
        return width * length * height;
    }

    public void printInfo() {
        System.out.println("\n----Box----");
        System.out.println("Name: " + name);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }

}
