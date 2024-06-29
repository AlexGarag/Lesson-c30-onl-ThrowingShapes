package by.tms.lessonc30onl.throwinshapes.container;

import by.tms.lessonc30onl.throwinshapes.baseclass.Shape;

public class Box extends Shape {
    private static double volumeBox;

    public Box(double settingVolume) {
        super(settingVolume);
    }

    public boolean add(Shape shape) {
        volumeBox = volumeBox + shape.getVolume();
        if (volumeBox > this.getVolume()) {
            return false;
        }
        return true;
    }
}
