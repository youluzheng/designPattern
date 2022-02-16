package command;

public class SimpleControl {
    private Command onCommand;
    private Command offCommand;
    private Command undoCommand;

    public SimpleControl() {
        this.onCommand = new NoCommand();
        this.offCommand = new NoCommand();
        this.undoCommand = new NoCommand();
    }

    public void setCommand(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void onPress() {
        this.onCommand.execute();
        this.undoCommand = this.onCommand;
    }

    public void offPress() {
        this.offCommand.execute();
        this.undoCommand = this.offCommand;
    }

    public void undoPress() {
        this.undoCommand.undo();
    }
}
