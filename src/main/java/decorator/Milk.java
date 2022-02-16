package decorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mike";
    }

    @Override
    public double cost() {
        return 0.5 + super.cost();
    }

}
