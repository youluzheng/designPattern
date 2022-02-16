package command;

public class Main {
    public static void main(String[] args) {
        SimpleControl simpleControl = new SimpleControl();
        simpleControl.onPress();
        simpleControl.offPress();
        simpleControl.undoPress();

        Light roomLight = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(roomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(roomLight);

        simpleControl.setCommand(lightOnCommand, lightOffCommand);
        simpleControl.onPress();
        simpleControl.undoPress();
        simpleControl.offPress();
        simpleControl.undoPress();
    }
}
