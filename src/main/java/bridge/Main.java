package bridge;

public class Main {
    public static void main(String[] args) {
        Circle bigGreenColor = new BigCircle(new GreenColor(), 10);
        bigGreenColor.getShape();
    }
}
