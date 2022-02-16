package decorator.self;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {
    public static final String BIG = "BIG";
    public static final String MIDDLE = "MIDDLE";

    private List<Condiment> condiments = new ArrayList<>();
    private String size;

    protected Beverage(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public void addCondiment(Condiment condiment) {
        this.condiments.add(condiment);
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        for (Condiment c : this.condiments) {
            sb.append(c.getDescription()).append(" ");
        }
        return sb.toString();
    }

    public double cost() {
        double cost = 0;
        for (Condiment c : this.condiments) {
            cost += c.cost();
        }
        return cost;
    }
}
