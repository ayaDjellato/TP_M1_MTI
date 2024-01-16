public class Circle3D implements Circle{
   
   public double radius = 0.1;

    public Circle3D(double radius) {
        this.radius = radius;
}

    @Override
    public double area() {
      return Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double perimeter() {
       return 3 * Math.PI * radius;
    }
    
}
