package by.tms.lessonc30onl.throwinshapes.baseclass;

public class SolidOfRevolution extends Shape {
    private final double radiusSolidOfRevolution;

    public SolidOfRevolution(double radius) {
        radiusSolidOfRevolution = radius;
    }

    public double getAreaBase() {
        return Math.PI * radiusSolidOfRevolution;
    }
}
