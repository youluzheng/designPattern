package factory.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        ComputerStore computerStore = new HangzhouComputerStore();
        computerStore.sellComputer("asus");
        computerStore.sellComputer("dell");
    }

}
