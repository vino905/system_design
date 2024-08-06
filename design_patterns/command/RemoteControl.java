package command;

import java.util.Stack;

public class RemoteControl {
    Stack<Command> acCommandHistory = new Stack<>();
    Command command;

    public RemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        acCommandHistory.add(command);
    }

    public void undo() {
        if (!acCommandHistory.isEmpty()) {
            Command popCommand = acCommandHistory.pop();
            popCommand.undo();
        }
    }
}
