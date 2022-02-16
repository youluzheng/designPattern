package factory.FactoryMethod;

public abstract class ComputerStore {
    public void sellComputer(String type) {
        Computer computer = this.createComputer(type);
        System.out.println("sell:" + computer.getName());
    }

    public abstract Computer createComputer(String type);
}
