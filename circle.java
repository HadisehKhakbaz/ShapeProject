package shapejava;

public class Circle extends Shape2D {

    private double radius;
    private static int ciCount;

    static {
        ciCount = 0;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
        ciCount++;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void print() {
        System.out.println("Circle: Area=" + getArea() +
                           "\tPerimeter=" + getPerimeter() +
                           "\tColor=" + getColor());
    }
}
