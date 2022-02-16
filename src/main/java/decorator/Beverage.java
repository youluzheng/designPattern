package decorator;

public abstract class Beverage {
    public static final String BIG = "BIG";
    public static final String MIDDLE = "MIDDLE";

    private String size;

    protected Beverage() {
    }

    protected Beverage(String size) {
        this.size = size;
    }

    public abstract String getDescription();

    public abstract double cost();

    public String getSize() {
        return this.size;
    }
}
