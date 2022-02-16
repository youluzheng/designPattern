package adapter;

public class Main {
    public static void main(String[] args) {
        Dock dock = new TurkeyAdapter(new WildTurkey());
        dock.quack();
        dock.fly();
    }
}
