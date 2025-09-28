package shapejava;

public class Square extends Rectangle {

    private static int sqCount;

    static {
        sqCount = 0;
    }

    public Square(double length, String color) {
        super(length, length, color);
        sqCount++;
    }

    @Override
    public void print() {
        System.out.println("Square: Area=" + getArea() +
                           "\tPerimeter=" + getPerimeter() +
                           "\tColor=" + getColor());
    }
}
