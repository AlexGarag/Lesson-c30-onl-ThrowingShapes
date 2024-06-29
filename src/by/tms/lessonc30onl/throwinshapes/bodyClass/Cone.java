package by.tms.lessonc30onl.throwinshapes.body;

import by.tms.lessonc30onl.throwinshapes.baseclass.SolidOfRevolution;

public class Cone extends SolidOfRevolution {
    private final double height;

    public Cone(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return super.getAreaBase() * height / 3;
    }
}
