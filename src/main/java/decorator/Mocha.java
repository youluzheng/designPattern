package decorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mocha";
    }

    @Override
    public double cost() {
        return 0.5 + super.cost();
    }
}
