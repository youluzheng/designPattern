package builder;

public abstract class ComputerBuilder {
    protected Computer computer = new Computer();
    public abstract void builderCpu();
    public abstract void builderMouse();
    public Computer buildComputer(){
        return this.computer;
    }
}
