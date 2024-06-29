package by.tms.lessonc30onl.throwinshapes.bodyClass;

import by.tms.lessonc30onl.throwinshapes.baseclass.SolidOfRevolution;

public class Cylinder extends SolidOfRevolution {
    private final double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return super.getAreaBase() * height;
    }
}
