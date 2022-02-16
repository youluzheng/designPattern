package bridge;

public class GreenColor implements ColorSelector {
    @Override
    public void getColor() {
        System.out.println("green");
    }
}
