package state_pattern;


import lombok.Getter;

interface MachineState {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}


class NoQuarterState implements MachineState {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}

interface HasQuarterState extends MachineState {

}

interface SellingState extends MachineState {}
interface SoldOutState extends MachineState {}
interface WinnerState extends MachineState {}


public class GumballMachine {

    @Getter
    MachineState noQuarterState, hasQuarterState, sellingState, soldOutState, winnerState;

    int count;

    MachineState currentState;

    public GumballMachine(int count) {
        this.count = count;
        noQuarterState = new NoQuarterState(this);
        currentState = noQuarterState;
    }

    void insertQuarter() {
        currentState.insertQuarter();
    }

    void ejectQuarter() {
        currentState.ejectQuarter();
    }

    void turnCrank() {
        currentState.turnCrank();
    }

    void dispense() {
        currentState.dispense();
    }

    void setState(MachineState state) {
        currentState = state;
    }
}
