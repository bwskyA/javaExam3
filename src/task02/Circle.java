package task02;

public class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        IShape.addToShapesList(this);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (getRadius() * getRadius());
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius + "";
    }
}
