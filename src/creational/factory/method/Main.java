package creational.factory.method;

/**
 * @author Martin Mirzoyan
 */

public class Main {
    public static void main(String[] args) {
        Shape c = ShapeFactory.createShape(ShapeType.CIRCLE);
        c.draw();

        Shape t = ShapeFactory.createShape(ShapeType.TRIANGLE);
        t.draw();

        Shape r = ShapeFactory.createShape(ShapeType.RECTANGLE);
        r.draw();
    }
}