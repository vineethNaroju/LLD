package command_pattern;

import lombok.Setter;


interface ISlotCommand {
    public void on();
    public void off();

    public void undo();
}


class Slot {

    @Setter
    private ISlotCommand command;

    public boolean isEmpty() {
        return command == null;
    }

    public void on() {
        // throw exception
        command.on();
    }

    public void off() {
        // throw exception
        command.off();
    }

    public void clear() {
        command = null;
    }
}


class RemoteControl {
    private Slot[] slots;
    private ISlotCommand undoCommand;

    public RemoteControl(int cnt) {
        slots = new Slot[cnt];
    }

    public void clickOn(int id) {
        slots[id].on();
    }

    public void clickOff(int id) {
        slots[id].off();
    }

    public void undo() {
        undoCommand.undo();
    }
}



public class Demo {

    public static void main(String[] args) {

    }
}
