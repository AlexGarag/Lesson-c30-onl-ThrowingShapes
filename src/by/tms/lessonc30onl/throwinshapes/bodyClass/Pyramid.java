package by.tms.lessonc30onl.throwinshapes.bodyClass;

import by.tms.lessonc30onl.throwinshapes.baseclass.Parallelogram;

public class Pyramid extends Parallelogram {
    private final double height;

    public Pyramid(double width, double depth, double height) {
        super(width, depth);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return super.getAreaBase() * height / 3;
    }
}
