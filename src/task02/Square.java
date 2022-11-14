package task02;

public class Square implements IShape {
    private double side;
    private double area, perimeter;

    public Square(double side) {
        this.side = side;
        countPerimeter();
        countArea();
        IShape.addToShapesList(this);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public void setArea(double area) {
        this.area = area;
    }


    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void countArea() {
        setArea(getSide() * getSide());
    }

    @Override
    public void countPerimeter() {
        setPerimeter(4 * getSide());
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
        return "Square by side " + side + "";
    }
}
