package command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("nothing execute");
    }

    @Override
    public void undo() {
        System.out.println("nothing undo");
    }

    @Override
    public void log() {
        System.out.println("nothing log");
    }

}
