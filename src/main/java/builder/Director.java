package builder;

public class Director {
    private ComputerBuilder computerBuilder;
    public void setComputerBuilder(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }
    public Computer constructComputer(){
        this.computerBuilder.buildComputer();
        this.computerBuilder.builderCpu();
        this.computerBuilder.builderMouse();
        return this.computerBuilder.buildComputer();
    }
}
