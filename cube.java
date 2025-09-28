package shapejava;

public class Cube extends Shape3D {
    private double length;
    private double width;
    private double height;
    private static int cuCount;

    static {
        cuCount = 0;
    }

    public Cube(double length, double width, double height, String color) {
        super(color);
        this.length = length;
        this.width = width;
        this.height = height;
        cuCount++;
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getArea() {
        return 2 * (length * width + length * height + width * height);
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("Cube: Area=" + getArea() +
                           "\tVolume=" + getVolume() +
                           "\tColor=" + getColor());
    }
}
