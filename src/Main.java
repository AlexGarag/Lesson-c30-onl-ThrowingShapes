import by.tms.lessonc30onl.throwinshapes.boxclass.Box;
import by.tms.lessonc30onl.throwinshapes.baseclass.ShapeGenerator;

public class Main {
    public static void main(String[] args) {
        Box box = new Box((int) (255 * Math.random())); // assigning the volume of the box randomly (maximum 255)
        boolean isBoxNotFull = false;
        int quantityShape = 0;
        do {
            isBoxNotFull = box.add(ShapeGenerator.generateShape());
            quantityShape = quantityShape + 1;
        } while (isBoxNotFull);
        System.out.println("There are " + quantityShape + " figures in the box");
    }
}