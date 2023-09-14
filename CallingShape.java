
import java.util.Scanner;

public class CallingShape {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        // Circle ---------------------------------------
        System.out.println("\n==== Input Circle ====");
        System.out.print("\n---- No. 01 ----");
        System.out.print("\nEnter the name: ");
        String nameCircle1 = scanner.nextLine();
        System.out.print("Enter the radius: ");
        double radiusCircle1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("\n---- No. 02 ----");
        System.out.print("\nEnter the name: ");
        String nameCircle2 = scanner.nextLine();
        System.out.print("Enter the radius: ");
        double radiusCircle2 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Circle c1 = new Circle(nameCircle1, radiusCircle1);
        c1.calArea();
        c1.calCircum();
        c1.calDiameter();
        c1.printInfo();
        c1.draw();

        Circle c2 = new Circle(nameCircle2, radiusCircle2);
        double c2Area = c1.calArea(c2.getRadius());
        c2.setArea(c2Area);
        double c2Circum = c1.calCircum(c2.getRadius());
        c2.setCircum(c2Circum);
        double c2Diameter = c1.calDiameter(c2.getRadius());
        c2.setDiameter(c2Diameter);
        c2.printInfo();
        c2.draw();
        // ------------------------------------------------

        // Cylinder ---------------------------------------
        System.out.println("\n==== Input Cylinder ====");
        System.out.print("\n---- No. 01 ----");
        System.out.print("\nEnter the name: ");
        String nameCylinder1 = scanner.nextLine();
        System.out.print("Enter the radius: ");
        double radiusCylinder1 = scanner.nextDouble();
        System.out.print("Enter the High: ");
        double highCylinder1 = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("\n---- No. 02 ----");
        System.out.print("\nEnter the name: ");
        String nameCylinder2 = scanner.nextLine();
        System.out.print("Enter the radius: ");
        double radiusCylinder2 = scanner.nextDouble();
        System.out.print("Enter the High: ");
        double highCylinder2 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Cylinder cy1 = new Cylinder(nameCylinder1, radiusCylinder1, highCylinder1);
        cy1.calArea();
        cy1.calVolume();
        cy1.printInfo();
        cy1.draw();

        Cylinder cy2 = new Cylinder(nameCylinder2, radiusCylinder2, highCylinder2);
        double cy2Area = cy1.calArea(cy2.getRadius(), cy2.getHigh());
        cy2.setArea(cy2Area);
        double cy2Volume = cy1.calVolume(cy2.getRadius(), cy2.getHigh());
        cy2.setVolume(cy2Volume);
        cy2.printInfo();
        cy2.draw();
        // ----------------------------------------------

        // Sphere ---------------------------------------
        System.out.println("\n==== Input Sphere ====");
        System.out.print("\n---- No. 01 ----");
        System.out.print("\nEnter the name: ");
        String nameSphere1 = scanner.nextLine();
        System.out.print("Enter the radius: ");
        double radiusSphere1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("\n---- No. 02 ----");
        System.out.print("\nEnter the name: ");
        String nameSphere2 = scanner.nextLine();
        System.out.print("Enter the radius: ");
        double radiusSphere2 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Sphere sp1 = new Sphere(nameSphere1, radiusSphere1);
        sp1.calVolume();
        sp1.calsurfaceArea();
        sp1.calCircum();
        sp1.printInfo();

        Sphere sp2 = new Sphere(nameSphere2, radiusSphere2);
        double sp2calsurfaceArea = sp1.calsurfaceArea(sp2.getRadius());
        sp2.setsurfaceArea(sp2calsurfaceArea);
        double sp2Volume = sp1.calVolume(sp2.getRadius());
        sp2.setVolume(sp2Volume);
        double sp2calCircum = sp1.calCircum(sp2.getRadius());
        sp2.setCircum(sp2calCircum);
        sp2.printInfo();
        // ----------------------------------------------

        // square ---------------------------------------

        System.out.println("\n==== Input Square ====");
        System.out.print("\n---- No. 01 ----");
        System.out.print("\nEnter the name: ");
        String nameSquare1 = scanner.nextLine();
        System.out.print("Enter the width: ");
        double widthSquare1 = scanner.nextDouble();
        System.out.print("Enter the Height: ");
        double heightSquare1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("\n---- No. 02 ----");
        System.out.print("\nEnter the name: ");
        String nameSquare2 = scanner.nextLine();
        System.out.print("Enter the width: ");
        double widthSquare2 = scanner.nextDouble();
        System.out.print("Enter the Height: ");
        double heightSquare2 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Square s1 = new Square(nameSquare1, widthSquare1, heightSquare1);
        s1.calArea();
        s1.printInfo();
        s1.draw();

        Square s2 = new Square(nameSquare2, widthSquare2, heightSquare2);
        double s2Area = s1.calArea(s2.getWidth(), s2.getHeight());
        s2.setArea(s2Area);
        s2.printInfo();
        s2.draw();
        // ---------------------------------------------

        // Cube ---------------------------------------
        System.out.println("\n==== Input Cube ====");
        System.out.print("\n---- No. 01 ----");
        System.out.print("\nEnter the name: ");
        String nameCube1 = scanner.nextLine();
        System.out.print("Enter the side: ");
        double sideCube1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("\n---- No. 02 ----");
        System.out.print("\nEnter the name: ");
        String nameCube2 = scanner.nextLine();
        System.out.print("Enter the side: ");
        double sideCube2 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Cube cu1 = new Cube(nameCube1, sideCube1);
        cu1.calArea();
        cu1.calVolume();
        cu1.printInfo();
        cu1.draw();

        Cube cu2 = new Cube(nameCube2, sideCube2);
        double cu2Area = cu1.calArea(cu2.getSide());
        cu2.setArea(cu2Area);
        double cu2Volume = cu1.calVolume(cu2.getSide());
        cu2.setVolume(cu2Volume);
        cu2.printInfo();
        cu2.draw();
        // ---------------------------------------------

        // Triangle ---------------------------------------
        System.out.println("\n==== Input Triangle ====");
        System.out.print("\n---- No. 01 ----");
        System.out.print("\nEnter the name: ");
        String nameTriangle1 = scanner.nextLine();
        System.out.print("Enter the base: ");
        double baseTriangle1 = scanner.nextDouble();
        System.out.print("Enter the Height: ");
        double heightTriangle1 = scanner.nextDouble();
        System.out.print("Enter the Side3: ");
        double side3Triangle1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("\n---- No. 02 ----");
        System.out.print("\nEnter the name: ");
        String nameTriangle2 = scanner.nextLine();
        System.out.print("Enter the base: ");
        double baseTriangle2 = scanner.nextDouble();
        System.out.print("Enter the Height: ");
        double heightTriangle2 = scanner.nextDouble();
        System.out.print("Enter the Side3: ");
        double side3Triangle2 = scanner.nextDouble();
        scanner.nextLine();

        Triangle t1 = new Triangle(nameTriangle1, baseTriangle1, heightTriangle1, side3Triangle1);
        t1.calArea();
        t1.calPerimeter();
        t1.printInfo();
        t1.draw();

        Triangle t2 = new Triangle(nameTriangle2, baseTriangle2, heightTriangle2, side3Triangle2);
        double t2Area = t1.calArea(t2.getBase(), t2.getHeight());
        t2.setArea(t2Area);
        double t2Perimeter = t1.calPerimeter(t2.getBase(), t2.getHeight(), t2.getSide3());
        t2.setPerimeter(t2Perimeter);
        t2.printInfo();
        t2.draw();
        // ---------------------------------------------

        // Rectangle ---------------------------------------
        System.out.println("\n==== Input Rectangle ====");
        System.out.print("\n---- No. 01 ----");
        System.out.print("\nEnter the name: ");
        String nameRectangle1 = scanner.nextLine();
        System.out.print("Enter the length: ");
        double lengthRectangle1 = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double widthRectangle1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("\n---- No. 02 ----");
        System.out.print("\nEnter the name: ");
        String nameRectangle2 = scanner.nextLine();
        System.out.print("Enter the length: ");
        double lengthRectangle2 = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double widthRectangle2 = scanner.nextDouble();
        scanner.nextLine();

        Rectangle r1 = new Rectangle(nameRectangle1, lengthRectangle1, widthRectangle1);
        r1.calArea();
        r1.calPerimeter();
        r1.printInfo();
        r1.draw();

        Rectangle r2 = new Rectangle(nameRectangle2, lengthRectangle2, widthRectangle2);
        double r2Area = r1.calArea(r2.getWidth(), r2.getlength());
        r2.setArea(r2Area);
        double r2calPerimeter = r1.calPerimeter(r2.getWidth(), r2.getlength());
        r2.setPerimeter(r2calPerimeter);
        r2.printInfo();
        r2.draw();
        // ---------------------------------------------

        // Box  ---------------------------------------
        System.out.println("\n==== Input Box ====");
        System.out.print("\n---- No. 01 ----");
        System.out.print("\nEnter the name: ");
        String nameBox1 = scanner.nextLine();
        System.out.print("Enter the length: ");
        double lengthBox1 = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double widthBox1 = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double heightBox1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("\n---- No. 01 ----");
        System.out.print("\nEnter the name: ");
        String nameBox2 = scanner.nextLine();
        System.out.print("Enter the length: ");
        double lengthBox2 = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double widthBox2 = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double heightBox2 = scanner.nextDouble();
        scanner.nextLine();

        Box b1 = new Box(nameBox1, lengthBox1, widthBox1, heightBox1);
        b1.calArea();
        b1.calVolume();
        b1.printInfo();
        b1.draw();

        Box b2 = new Box(nameBox2,lengthBox2,widthBox2,heightBox2);
        double b2Area = b1.calArea(b2.getWidth(),b2.getHeight(),b2.getLength());
        b2.setArea(b2Area);
        double b2Volume = b1.calVolume(b2.getWidth(),b2.getHeight(),b2.getLength());
        b2.setVolume(b2Volume);
        b2.printInfo();
        b2.draw();
        // ---------------------------------------------

    }

    /*
     * private static double getHeight() {
     * return 0;
     * }
     */
}