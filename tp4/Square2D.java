public class Square2D implements Square {

   public double side;

    public Square2D(double side) {
        this.side = side;
}

    @Override
    public double area() {
      return side*side;
    }

    @Override
    public double perimeter() {
       return (side+side)*4;
    }
    
}
