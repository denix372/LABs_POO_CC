package Lab6.Problema1;

public class Rectangle extends Shape {
    double width;
    double length;

    
    public Rectangle() {
        this(0,0);
    }

    public Rectangle(double width, double length) {
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle with width: " + width +
                "\nlength: " + length +
                "\ncolor: " + getColor() +
                "\nfilled " + isFilled();
    }
}
