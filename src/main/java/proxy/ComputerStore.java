package proxy;

import java.lang.reflect.Proxy;

public class ComputerStore implements IComputerStore{
    private String name;

    public ComputerStore(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IComputerStore getProxy(){
        return (IComputerStore) Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                this.getClass().getInterfaces(),
                new ComputerStoreInvocationHandler(this)
        );
    }
}
