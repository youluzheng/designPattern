package builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setComputerBuilder(new DellComputerBuilder());
        Computer computer = director.constructComputer();
        System.out.println(computer);
    }
}
