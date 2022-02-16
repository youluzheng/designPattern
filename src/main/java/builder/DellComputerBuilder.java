package builder;

public class DellComputerBuilder extends ComputerBuilder{
    @Override
    public void builderCpu() {
        this.computer.setCpu("intel i7");
    }

    @Override
    public void builderMouse() {
        this.computer.setMouse("logic master");
    }
}
