package by.tms.lessonc30onl.throwinshapes.bodyClass;

import by.tms.lessonc30onl.throwinshapes.baseclass.Parallelogram;

public class Parallelepiped extends Parallelogram {
    private final double height;

    public Parallelepiped(double width, double depth, double height) {
        super(width, depth);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return super.getAreaBase() * height;
    }
}
