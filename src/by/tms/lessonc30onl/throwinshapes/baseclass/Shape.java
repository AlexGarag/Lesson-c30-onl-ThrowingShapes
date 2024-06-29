package by.tms.lessonc30onl.throwinshapes.baseclass;

import by.tms.lessonc30onl.throwinshapes.interfaces.CapableGivingVolume;

public class Shape implements CapableGivingVolume {
    private double volumeShape;

    public Shape(double volume) {
        volumeShape = volume;
    }

    public Shape() {
    }

    public double getVolume() {
        return volumeShape;
    }
}
