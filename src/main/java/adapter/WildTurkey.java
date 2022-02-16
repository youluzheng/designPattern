package adapter;

public class WildTurkey implements Turkey {

    @Override
    public void qobble() {
        System.out.println("qobble");
    }

    @Override
    public void fly() {
        System.out.println("fly short");
    }

}
