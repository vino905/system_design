package command;

public class AcTurnOffCommand implements Command {
    AirConditioner ac;

    public AcTurnOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOfAc();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
