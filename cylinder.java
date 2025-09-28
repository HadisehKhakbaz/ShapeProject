package shapejava;

public class Cylinder extends Shape3D {

    private double radius;
    private double height;
    private static int cyCount;

    static {
        cyCount = 0;
    }

    public Cylinder(double radius, double height, String color) {
        super(color);
        this.radius = radius;
        this.height = height;
        cyCount++;
    }

    public double getVolume() {
        return Math.PI * radius * height;
    }

    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double
