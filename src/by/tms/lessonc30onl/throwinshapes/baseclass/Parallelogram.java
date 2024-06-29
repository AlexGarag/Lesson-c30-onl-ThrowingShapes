package by.tms.lessonc30onl.throwinshapes.baseclass;

public class Trapezoid extends Shape {
    private final double widthTrapezoid;
    private final double depthTrapezoid;

    public Trapezoid (double width, double depth) {
        widthTrapezoid = width;
        depthTrapezoid = depth;
    }

    public double getAreaBase() {
        return widthTrapezoid * depthTrapezoid;
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }
}