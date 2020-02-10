import Shapes.Rectangle;
import Shapes.Shape;

public class Main {

    public static void main(String [] args) {

        Shape rectangle = new Rectangle(2,4);

        Shape copyRectangle = rectangle.clone();

        System.out.println("Original Width " + ((Rectangle) rectangle).getWidth()
                + " --|||||-- Copied Width: "+ ((Rectangle) copyRectangle).getWidth());


        System.out.println("Original height " + ((Rectangle) rectangle).getHeight()
                + " --|||||-- Copied height: "+ ((Rectangle) copyRectangle).getHeight());
    }
}
