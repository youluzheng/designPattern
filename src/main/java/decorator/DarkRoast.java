package decorator;

public class DarkRoast extends Beverage {

    public DarkRoast(String size) {
        super(size);
    }

    @Override
    public String getDescription() {
        return "darkRoast";
    }

    @Override
    public double cost() {
        if (this.getSize().equals(Beverage.BIG)) {
            return 1.5;
        } else {
            return 1.0;
        }
    }

}