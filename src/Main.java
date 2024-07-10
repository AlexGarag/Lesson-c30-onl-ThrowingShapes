import by.tms.lessonc30onl.throwinshapes.baseclass.Shape;
import by.tms.lessonc30onl.throwinshapes.boxclass.Box;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(); // the volume of the box is set randomly in the constructor
        int quantityShape = 0;
        do {
            if (box.add(Shape.generateShape())) {
                quantityShape = quantityShape + 1;
            } else {
                break;
            }
        } while (true);
        System.out.println();
        System.out.println("There are " + quantityShape + " figures in the box");
    }
}