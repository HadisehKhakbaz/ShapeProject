package shapejava;

public class Rectangle extends Shape2D {

    private double length;
    private double width;
    private static int recCount;

    static {
        recCount = 0;
    }

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
        recCount++;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void print() {
        System.out.println("Rectangle: Area=" + getArea() +
                           "\tPerimeter=" + getPerimeter() +
                           "\tColor=" + getColor());
    }
}
