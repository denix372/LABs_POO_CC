package Lab6.Problema1;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        this.radius = 1;
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
    public double getArea(){
        return this.radius * this.radius * 3.14159;
    }

    @Override
    public double getPerimeter(){
        return 2 * this.radius * 3.14159;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius +
                "\n color: " + getColor() + "\n filled: " + isFilled();
    }
}
