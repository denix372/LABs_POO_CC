package Lab6.Problema1;

public class Circle extends Shape{
    double radius;
    public Circle() {
        this(0);
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.141592 * radius;
    }

    @Override
    public double getArea() {
        return 3.141592 * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius +
                "\ncolor: " + super.getColor() +
                "\nfilled: " + super.isFilled();
    }
}
