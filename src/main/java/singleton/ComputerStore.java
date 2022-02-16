package singleton;

public class ComputerStore {
    private static volatile ComputerStore computerStore;

    private ComputerStore() {

    }

    public static ComputerStore getInstance() {
        if (ComputerStore.computerStore == null) {
            synchronized (ComputerStore.class) {
                if (ComputerStore.computerStore == null) {
                    ComputerStore.computerStore = new ComputerStore();
                }
            }
        }
        return ComputerStore.computerStore;
    }
}