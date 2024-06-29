package by.tms.lessonc30onl.throwinshapes.bodyClass;

import by.tms.lessonc30onl.throwinshapes.baseclass.SolidOfRevolution;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return super.getAreaBase() * 4 / 3;
    }
}
