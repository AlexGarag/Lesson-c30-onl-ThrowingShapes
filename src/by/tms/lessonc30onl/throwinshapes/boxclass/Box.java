package by.tms.lessonc30onl.throwinshapes.boxclass;

import by.tms.lessonc30onl.throwinshapes.baseclass.Shape;

public class Box extends Shape {
    private static double volumeBox;

    public Box(double settingVolume) {
        super(settingVolume);
    }

    public boolean add(Shape shape) {
        volumeBox = volumeBox + shape.getVolume();
//        System.out.println(shape.getClass().getName());
        if (volumeBox > this.getVolume()) {
            return false;
        }
        return true;
    }
}
