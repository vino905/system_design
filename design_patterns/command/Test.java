package command;

public class Test {
    public static void main(String[] args) {

        AirConditioner airConditioner = new AirConditioner();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new AcTurnOffCommand(airConditioner));
        remoteControl.pressButton();
        remoteControl.undo();
    }
}
