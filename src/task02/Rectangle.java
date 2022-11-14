package task02;

public class Rectangle implements IShape {
    private double side1, side2;
    private double area, perimeter;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        countPerimeter();
        countArea();
        IShape.addToShapesList(this);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void countArea() {
        setArea(getSide1() * getSide2());
    }

    @Override
    public void countPerimeter() {
        setPerimeter((2 * getSide1()) + (2 * getSide2()));
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
        return "Rectangle by side "+ side1 + "x" + side2 + "";
    }
}
