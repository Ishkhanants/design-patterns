package creational.factory.method;

/**
 * @author Martin Mirzoyan
 */

public class ShapeFactory {
    public static Shape createShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();

            case TRIANGLE:
                return new Triangle();

            case RECTANGLE:
                return new Rectangle();
        }

        throw new RuntimeException("Unexpected behavior");
    }
}