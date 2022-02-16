package proxy;

public class Main {
    public static void main(String[] args) {
        IComputerStore computerStore = new ComputerStore("computerStore");
        IComputerStore computerStoreProxy = computerStore.getProxy();
        System.out.println(computerStoreProxy.getName());
    }
}
