package bridge;

public abstract class Circle extends Shape {
    protected int radius;
    protected Circle(ColorSelector colorSelector, int radius){
        super(colorSelector);
        this.radius = radius;
    }
}
