import java.util.Scanner;

public class Sphere extends Circle {

    Scanner scanner = new Scanner(System.in);

    protected double volume;
    protected double surfaceArea;

    // default constructor
    public Sphere() {

    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    public Sphere(String name) {
        this.name = name;
    }

    public Sphere(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    // methods
    public void setArea(double area) {
        this.area = area;
    }

    public void setsurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void calsurfaceArea() {
        this.surfaceArea = 4 * Math.PI * (radius * radius);
    }

    public double calsurfaceArea(double radius) {
        return 4 * Math.PI * (radius * radius);
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void calVolume() {
        this.volume = 0.75 * Math.PI * (radius * radius * radius);
    }

    public double calVolume(double radius) {
        return 0.75 * Math.PI * (radius * radius * radius);
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

    public void draw() {
        System.out.println("Draw a sphere with volume " + volume);
    }

    public void printInfo() {
        System.out.println("\n---- Print Sphere Info----");
        System.out.println("Name: " + name);
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Volume: " + volume);
        System.out.println("surfaceArea: " + surfaceArea);
    }
}
