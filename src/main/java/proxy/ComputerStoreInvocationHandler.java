package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ComputerStoreInvocationHandler implements InvocationHandler {

    private IComputerStore computerStore;

    public ComputerStoreInvocationHandler(IComputerStore computerStore){
        this.computerStore = computerStore;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println(method.getName());
        System.out.println(objects);
        return method.invoke(this.computerStore, objects);
    }
}
