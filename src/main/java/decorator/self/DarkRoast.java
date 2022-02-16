package decorator.self;

public class DarkRoast extends Beverage {

    protected DarkRoast(String size) {
        super(size);
    }

    @Override
    public String getDescription() {
        return "darkRoast, " + super.getDescription();
    }

    @Override
    public double cost() {
        if (this.getSize().equals(Beverage.BIG)) {
            return 1.5 + super.cost();
        } else {
            return 1.0 + super.cost();
        }
    }

}
