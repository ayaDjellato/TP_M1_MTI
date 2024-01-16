
public class MainCls {
     public static void main(String[] args) {
        // Circle, Triangle, and Square
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        Square square = new Square(4.0);

        ShapeDetails(circle);
        ShapeDetails(triangle);
        ShapeDetails(square);
    }

    private static void ShapeDetails(Shape shape) {
        System.out.println("Shape Type: " + shape.getClass().getSimpleName());
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println();
    }}

