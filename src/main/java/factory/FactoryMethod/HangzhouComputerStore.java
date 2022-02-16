package factory.FactoryMethod;

public class HangzhouComputerStore extends ComputerStore {

    @Override
    public Computer createComputer(String type) {
        if ("asus".equals(type)) {
            return new AsusComputer("asus");
        }
        return new DellComputer("dell");
    }

}
