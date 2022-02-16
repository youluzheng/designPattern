package decorator.self;

public class Mocha extends Condiment {
    @Override
    public String getDescription() {
        return "mocha";
    }

    @Override
    public double cost() {
        return 0.2;
    }
}
