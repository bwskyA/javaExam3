package task02;

public class Square implements IShape {
    private double side;

    public Square(double side) {
        this.side = side;
        IShape.addToShapesList(this);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return "Square by side " + side + "";
    }
}
