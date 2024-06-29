package by.tms.lessonc30onl.throwinshapes;

import java.awt.*;

public class Box extends Shape {
    private double boxVolume;

    public Box(double settingVolume) {
        boxVolume = settingVolume;
    }

    @Override
    public double getVolume() {
        return boxVolume;
    }
}
