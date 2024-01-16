public class Circle2D implements Circle {

   public double radius = 3.16;

    public Circle2D(double radius) {
        this.radius = radius;
}

    @Override
    public double area() {
      return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
       return 2 * Math.PI * radius;
    }
    
}
