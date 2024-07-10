package by.tms.lessonc30onl.throwinshapes.baseclass;

import by.tms.lessonc30onl.throwinshapes.bodyClass.*;
import by.tms.lessonc30onl.throwinshapes.interfaces.CapableGivingVolume;

public abstract class Shape implements CapableGivingVolume {
    protected double volume;

    public double getVolume() {
        return volume;
    }

    public static Shape generateShape() {
        double x = Math.random() * 3;   // assigning shape sizes randomly (from zero to three)
        double y = Math.random() * 3;
        double z = Math.random() * 3;
        switch ((int) (5 * Math.random())) {    // choosing the shape type by generating a random number (one of five)
            case 1:
                return new Cylinder(x, y);
            case 2:
                return new Cone(x, y);
            case 3:
                return new Ball(x);
            case 4:
                return new Parallelepiped(x, y, z);
        }
        return new Pyramid(x, y, z);
    }
}