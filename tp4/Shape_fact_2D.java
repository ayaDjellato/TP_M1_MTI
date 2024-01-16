public class Shape_fact_2D extends AbsShape_Fact {

    @Override
    public Shape createCircle(double d) {
        return new Circle2D(d);
    }
    @Override
    public Shape createSquare(double d) {
        return new Square2D(d);
    }


}
