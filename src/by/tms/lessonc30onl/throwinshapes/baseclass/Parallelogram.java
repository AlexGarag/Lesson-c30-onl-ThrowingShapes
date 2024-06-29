package by.tms.lessonc30onl.throwinshapes.baseclass;

public class Parallelogram extends Shape {
    private final double widthParallelogram;
    private final double depthParallelogram;

    public Parallelogram (double width, double depth) {
        widthParallelogram = width;
        depthParallelogram = depth;
    }

    public double getAreaBase() {
        return widthParallelogram * depthParallelogram;
    }
}