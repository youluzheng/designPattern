package flyweight;

public class Main {
    public static void main(String[] args) {
        ComputerStorage computerStorage = new ComputerStorage();
        computerStorage.getComputer("hp");
        computerStorage.getComputer("dell");
        computerStorage.getComputer("hp");
        computerStorage.getComputer("hp");
    }
}
