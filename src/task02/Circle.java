package task02;

public class Circle implements IShape {
    private double radius;
    private double area, perimeter;

    public Circle(double radius) {
        this.radius = radius;
        countPerimeter();
        countArea();
        IShape.addToShapesList(this);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void countArea() {
        setArea(Math.PI * (getRadius() * getRadius()));
    }

    @Override
    public void countPerimeter() {
        setPerimeter(2 * Math.PI * getRadius());
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius + "";
    }
}
