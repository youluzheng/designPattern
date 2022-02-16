package state.odinary;

public class Main {
    public static void main(String[] args) {
        SellMachine machine = new SellMachine(1);
        machine.addCoin();
        machine.pressButton();
        machine.takeOut();
        machine.addCoin();
        machine.fill(1);
        machine.addCoin();
    }
}
