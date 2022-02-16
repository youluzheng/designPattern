package bridge;

public abstract class Shape {
    protected ColorSelector colorSelector;
    protected Shape(ColorSelector colorSelector){
        this.colorSelector = colorSelector;
    }
    public abstract void getShape();
}
