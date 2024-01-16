public class Shape_fact_3D extends AbsShape_Fact {

    @Override
    public Shape createCircle(double d) {
        return new Circle3D(d);
    }

    @Override
    public Shape createSquare(double d) {
        return new Square2D(d);
    }


} 
