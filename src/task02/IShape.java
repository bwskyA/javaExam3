package task02;

import java.util.ArrayList;
import java.util.List;

public interface IShape {
    double getArea();

    double getPerimeter();

    static List<IShape> shapesList = new ArrayList<>();

    static void addToShapesList(IShape shape) {
        shapesList.add(shape);
    }

    static IShape createSquare(double value) {
        return new Square(value);
    }

    static IShape createCircle(double value) {
        return new Circle(value);
    }

    static IShape createRectangle(double value1, double value2) {
        return new Rectangle(value1, value2);
    }

    static IShape largestArea() {
        double largestArea = shapesList.get(0).getArea();
        IShape largestAreaShape = shapesList.get(0);

        for (IShape shape : shapesList) {
            if (shape.getArea() > largestArea) {
                largestAreaShape = shape;
                largestArea = shape.getArea();
            }
        }
        return largestAreaShape;
    }

    static IShape largestPerimetr() {
        double largestPerimetr = shapesList.get(0).getPerimeter();
        IShape largestPerimetrShape = shapesList.get(0);

        for (IShape shape : shapesList) {
            if (shape.getArea() > largestPerimetr) {
                largestPerimetrShape = shape;
                largestPerimetr = shape.getArea();
            }
        }
        return largestPerimetrShape;
    }
}
