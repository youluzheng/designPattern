package factory.abstractFactory;

public class HangzhouComputerFactor implements ComputerFactory {

    @Override
    public CPU createCPU() {
        return new IntelCPU("intel");
    }

    @Override
    public Memory creatMemory() {
        return null;
    }

}
