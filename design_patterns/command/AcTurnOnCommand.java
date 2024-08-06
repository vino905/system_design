package command;

public class AcTurnOnCommand implements Command {
    AirConditioner ac;

    public AcTurnOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOfAc();
    }
}
