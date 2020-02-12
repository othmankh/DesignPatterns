package Shapes;

public abstract class Shape {
    private int y;
    private int x;
    private String color;

    public Shape() {

    }

    public Shape(Shape shape) {
        super();
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public abstract Shape clone();

}

