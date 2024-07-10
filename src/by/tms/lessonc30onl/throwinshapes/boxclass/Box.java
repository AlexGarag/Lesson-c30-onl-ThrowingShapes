package by.tms.lessonc30onl.throwinshapes.boxclass;

import by.tms.lessonc30onl.throwinshapes.baseclass.Shape;

public class Box extends Shape {
    private double occupiedVolume;

    public Box() {
        volume = (int) (255 * Math.random());    // assigning the volume of the box randomly (maximum 255)
        occupiedVolume = 0;
    }

    public boolean add(Shape shape) {
        occupiedVolume = occupiedVolume + shape.getVolume();
//        System.out.println(shape.getClass().getName());
        if (occupiedVolume > this.getVolume()) {
            return false;
        }
        return true;
    }
}
