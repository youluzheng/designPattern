package bridge;

public class BigCircle extends Circle{

    public BigCircle(ColorSelector colorSelector, int radius){
        super(colorSelector, radius);
    }

    @Override
    public void getShape() {
        this.colorSelector.getColor();
        System.out.println("big circle, radius:" + this.radius);
    }
}
