package decorator;

public abstract class CondimentDecorator extends Beverage {
    private Beverage beverage;

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription();
    }

    @Override
    public double cost() {
        return this.beverage.cost();
    }
}
