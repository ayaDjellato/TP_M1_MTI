public class Factory extends AbsFact {

    @Override
    public Shape getShape(String name, double val) {



        if(name == "square")
        {Square square = new Square(val);
        return square;
        }else if(name == "circle")
        {Circle circle = new Circle(val);
        return circle;
        }

        return null;

    }
}
