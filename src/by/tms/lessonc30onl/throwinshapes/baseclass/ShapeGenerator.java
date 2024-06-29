package by.tms.lessonc30onl.throwinshapes.container;

import by.tms.lessonc30onl.throwinshapes.baseclass.Shape;
import by.tms.lessonc30onl.throwinshapes.body.*;

public class ShapeGenerator {
    public static Shape generateShape() {
        int randomNumberShape = (int) (5 * Math.random());
        switch (randomNumberShape) {
            case 1:
                return new Cylinder(2, 1.5);
            case 2:
                return new Cone(2, 1.5);
            case 3:
                return new Ball(2);
            case 4:
                return new Parallelepiped(2, 2, 2);
        }
        return new Pyramid(2, 2, 2);
    }
}
