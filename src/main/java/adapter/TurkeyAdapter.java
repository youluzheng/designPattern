package adapter;

public class TurkeyAdapter implements Dock {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            this.turkey.fly();
        }
    }

    @Override
    public void quack() {
        this.turkey.qobble();
    }

}
