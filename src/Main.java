import by.tms.lessonc30onl.throwinshapes.boxclass.Box;
import by.tms.lessonc30onl.throwinshapes.baseclass.ShapeGenerator;

public class Main {
    public static void main(String[] args) {
        Box box = new Box((int) (255 * Math.random())); // assigning the volume of the box randomly (maximum 255)
        int quantityShape = 0;
        do {
            if (box.add(ShapeGenerator.generateShape())) {
                quantityShape = quantityShape + 1;
            } else {
                break;
            }
        } while (true);
        System.out.println();
        System.out.println("There are " + quantityShape + " figures in the box");
    }
}