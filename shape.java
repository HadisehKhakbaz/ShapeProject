package shapejava;

public class Shape {
    private String color;
    private static int shapeCount;

    static {
        shapeCount = 0;
    }

    public Shape(String color) {
        this.color = color;
        shapeCount++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printCount() {
        System.out.println("Count: " + shapeCount);
    }
}
