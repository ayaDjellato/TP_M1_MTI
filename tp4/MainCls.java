
public class MainCls {
     public static void main(String[] args) {
     
        Shape_fact_2D fact2D = new Shape_fact_2D();
        Shape shape2D = fact2D.createCircle(0.33);
        Shape Square2D = fact2D.createSquare(4);

        Shape_fact_3D fact3D = new Shape_fact_3D();
        Shape shape3D = fact3D.createCircle(0.33);

        
        ShapeDetails(shape2D);
        ShapeDetails(shape3D);
        ShapeDetails(Square2D);

    }

    private static void ShapeDetails(Shape shape) {
        System.out.println("Shape Type: " + shape.getClass().getSimpleName());
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println();
    }}

