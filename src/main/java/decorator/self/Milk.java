package decorator.self;

public class Milk extends Condiment {

    @Override
    public String getDescription() {
        return "milk";
    }

    @Override
    public double cost() {
        return 0.1;
    }

}
