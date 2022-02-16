package factory.FactoryMethod;

public abstract class Computer {
    private String name;

    protected Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
