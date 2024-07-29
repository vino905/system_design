package factory;

public class Test {

    public static void main(String[] args) {
        ShapFactory shapFactory = new ShapFactory();
        Shape shape1 = shapFactory.getShape("RECTANGLE");
        Shape shape2 = shapFactory.getShape("CIRCLE");
        shape1.draw();
        shape2.draw();
    }
}
