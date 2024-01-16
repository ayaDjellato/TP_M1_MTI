public class Main{
   public static void main(String[] args){
    Factory factory = new Factory();
    
    Shape shape = factory.getShape("circle", 2);
    shape.area();
    System.out.println("Shape Type: " + shape.getClass().getSimpleName());
    System.out.println("Area: " + shape.area());
    System.out.println("Perimeter: " + shape.perimeter());
   }
}