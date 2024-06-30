package by.tms.lessonc30onl.throwinshapes.baseclass;

import by.tms.lessonc30onl.throwinshapes.bodyClass.*;
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

    public static Shape generateShape() {
        int randomNumberShape = (int) (5 * Math.random());  // choosing the shape type by generating a random number (one of five)
        double x = Math.random() * 3;   // assigning shape sizes randomly (from zero to three)
        double y = Math.random() * 3;
        double z = Math.random() * 3;
        switch (randomNumberShape) {
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
